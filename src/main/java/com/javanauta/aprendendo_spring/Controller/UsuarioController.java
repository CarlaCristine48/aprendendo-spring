package com.javanauta.aprendendo_spring.Controller;

//Aqui o usuário vai acessar e gravar os seus dados no banco de dados.

import com.javanauta.aprendendo_spring.Business.UsuarioService;
import com.javanauta.aprendendo_spring.Controller.DTOs.UsuarioDTO;
import com.javanauta.aprendendo_spring.Infrastructure.entity.Usuario;
import com.javanauta.aprendendo_spring.Infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que a classe é o controlador, ela vai lidar com as requisições e observar os padrões Rest com o uso de URIs, verbos HTTP, etc
@RequestMapping("/usuario") // Responsável por apontar a URI da controller, isso diferencia o que cada controller faz.
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @PostMapping
    public ResponseEntity<Usuario> salvaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.salvaUsuario(usuario));
    }

    @PostMapping("/login")
    public String login (@RequestBody UsuarioDTO usuarioDTO){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(usuarioDTO.getEmail(), usuarioDTO.getSenha())
        );
        return "Bearer " + jwtUtil.generateToken(authentication.getName());
    }

    @GetMapping
    public ResponseEntity<Usuario> buscaUsuarioProrEmail(@RequestParam("email") String email){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity <Void> deletaUsuarioPorEmail(@PathVariable String email){
        usuarioService.deletaUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }
}
