package com.avaliacao.gerenciador_tarefas.controller;

import com.avaliacao.gerenciador_tarefas.banco.BancoTarefa;
import com.avaliacao.gerenciador_tarefas.model.Tarefas;

import java.util.List;

public class ControllerTarefas {
    BancoTarefa bancoTarefa = new BancoTarefa();

    // Listar todas as tarefas
    public List<Tarefas> findAll() {
        return bancoTarefa.getAll();
    }

    // Buscar tarefa por id
    public Tarefas getById(int id) {
        return bancoTarefa.getById(id);
    }

    // Inserir uma nova tarefa
    public boolean insert(Tarefas tarefa) {
        return bancoTarefa.insert(tarefa);
    }

    // Atualizar status de uma tarefa
    public boolean updateStatus(int idTarefa, String status) {
        return bancoTarefa.update(idTarefa, status);
    }

    // Deletar tarefa por id
    public boolean delete(int id) {
        return bancoTarefa.delete(id);
    }
}

