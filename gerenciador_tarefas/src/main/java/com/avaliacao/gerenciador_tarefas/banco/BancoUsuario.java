package com.avaliacao.gerenciador_tarefas.banco;

import com.avaliacao.gerenciador_tarefas.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BancoUsuario {

    private final List<Usuario> usuarios;

    public BancoUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public List<Usuario> getAll() {
        return new ArrayList<>(usuarios);
    }

    public Usuario getById(int id) {
        return usuarios.stream()
                .filter(u -> u.getIdUsuario() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean insert(Usuario usuario) {
        usuarios.add(usuario);
        return true;
    }

    public boolean update(int id, String nome, String email) {
        Usuario usuarioBanco = getById(id);
        if (usuarioBanco == null) {
            return false;
        }

        usuarioBanco.setNome(nome);
        usuarioBanco.setEmail(email);
        return true;
    }

    public boolean delete(int id) {
        Usuario usuarioBanco = getById(id);
        if (usuarioBanco == null) {
            return false;
        }

        usuarios.remove(usuarioBanco);
        return true;
    }

    public boolean update(int idUsuario, Usuario usuarioAtualizado) {
        return false;
    }
}

