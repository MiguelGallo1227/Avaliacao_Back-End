package com.avaliacao.gerenciador_tarefas.view;

import com.avaliacao.gerenciador_tarefas.controller.ControllerUsuario;
import com.avaliacao.gerenciador_tarefas.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UsuarioView {
    ControllerUsuario usuarioController = new ControllerUsuario();

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioController.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable int id) {
        return usuarioController.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody Usuario usuario) {
        return usuarioController.insert(usuario);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable int id, @RequestBody Usuario usuarioAtualizado) {
        return usuarioController.update(id, usuarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return usuarioController.delete(id);
    }
}
