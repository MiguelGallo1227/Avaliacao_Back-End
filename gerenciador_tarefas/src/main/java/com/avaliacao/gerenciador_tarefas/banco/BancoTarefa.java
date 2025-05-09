package com.avaliacao.gerenciador_tarefas.banco;

import com.avaliacao.gerenciador_tarefas.model.Tarefas;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;

public class BancoTarefa {

    private final List<Tarefas> tarefas;

    public BancoTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefas> getAll() {
        return new ArrayList<>(tarefas);
    }

    public Tarefas getById(int id) {
        return tarefas.stream()
                .filter(t -> t.getIdTarefas() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean insert(Tarefas tarefas) {
        tarefas.add(tarefas);
        return true;
    }

    public boolean update(int id, String titulo) {
        Tarefas tarefaBanco = getById(id);
        if (tarefaBanco == null) {
            return false;
        }

        tarefaBanco.setTitulo(titulo);
        tarefaBanco.setDescricao(titulo);
        tarefaBanco.setStatus(tarefaBanco.getStatus());
        int s1 = s;
        return true;
    }

    public boolean delete(int id) {
        Tarefas tarefaBanco = getById(id);
        if (tarefaBanco == null) {
            return false;
        }

        tarefas.remove(tarefaBanco);
        return true;
    }
}
