package com.avaliacao.gerenciador_tarefas.model;

import lombok.Data;
@Data
public class Tarefas {
    private Long idTarefas;
    private String titulo;
    private String descricao;
    private String status;

    public Tarefas(Long idTarefas, String titulo, String descricao, String status) {
        this.idTarefas = idTarefas;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public Tarefas() {
    }

    public void add(Tarefas tarefas) {
    }
}
