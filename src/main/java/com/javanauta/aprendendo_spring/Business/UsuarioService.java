package com.javanauta.aprendendo_spring.Business;


import com.javanauta.aprendendo_spring.Infrastructure.Exceptions.ConflictException;
import com.javanauta.aprendendo_spring.Infrastructure.Exceptions.ResourceNotFoundException;
import com.javanauta.aprendendo_spring.Infrastructure.Repository.UsuarioRepository;
import com.javanauta.aprendendo_spring.Infrastructure.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service // Indica para o spring que tem uma service
@RequiredArgsConstructor // Vai gerar um construtor que inicializa somente os campos que tem o private final declarado na inicialição
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    //Método responsável apenas por salvar usuário
    public Usuario salvaUsuario(Usuario usuario){
        try{
            emailExiste(usuario.getEmail());
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
            return usuarioRepository.save(usuario);
        }catch (ConflictException e){
            throw new ConflictException("Email já cadastrado", e.getCause());
        }
    }

    //Método responsável por verificar se o email existe e caso ele exista, gerar uma exception
    public void emailExiste(String email){
        try{
            Boolean existe = verificaEmailExistente(email);
            if(existe){
                throw new ConflictException("Email já cadastrado " + email);
            }
        } catch (ConflictException e) {
            throw new ConflictException("Email já cadastrado " + e.getCause());
        }
    }

    //Método responsável apénas por chamar a função da Repository
    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public Usuario buscarUsuarioPorEmail(String email){
        return usuarioRepository.findByEmail(email).orElseThrow(
                () -> new ResourceNotFoundException("Email não encontrado " + email)
        );
    }

    public void deletaUsuarioPorEmail(String email){
        usuarioRepository.deleteByEmail(email);
    }
}
