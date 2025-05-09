package com.avaliacao.gerenciador_tarefas.model;

import lombok.Data;
@Data
public class Usuario {

    private Long idUsuario;
    private String nome;
    private String email;

    public Usuario(Long idUsuario, String nome, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
    }

    public Usuario() {
    }
}
