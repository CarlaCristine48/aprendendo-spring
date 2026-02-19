package com.javanauta.aprendendo_spring.Controller.DTOs;

// Classe de transferência de objetos entre uma classe para outra.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO {
    private String email;
    private String senha;
}
