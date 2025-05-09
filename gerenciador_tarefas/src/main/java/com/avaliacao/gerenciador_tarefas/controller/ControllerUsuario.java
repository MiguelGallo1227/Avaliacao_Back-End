package com.avaliacao.gerenciador_tarefas.controller;


import com.avaliacao.gerenciador_tarefas.banco.BancoUsuario;
import com.avaliacao.gerenciador_tarefas.model.Usuario;

import java.util.List;

public class ControllerUsuario {
    BancoUsuario bancoUsuario = new BancoUsuario();

    // Listar todos os usuários
    public List<Usuario> findAll() {
        return bancoUsuario.getAll();
    }

    // Buscar usuário por id
    public Usuario getById(int id) {
        return bancoUsuario.getById(id);
    }

    // Inserir um novo usuário
    public boolean insert(Usuario usuario) {
        return bancoUsuario.insert(usuario);
    }

    // Atualizar usuário por id
    public boolean update(int idUsuario, Usuario usuarioAtualizado) {
        return bancoUsuario.update(idUsuario, usuarioAtualizado);
    }

    // Deletar usuário por id
    public boolean delete(int id) {
        return bancoUsuario.delete(id);
    }
}
