package com.avaliacao.gerenciador_tarefas.view;

import com.avaliacao.gerenciador_tarefas.controller.ControllerTarefas;
import com.avaliacao.gerenciador_tarefas.model.Tarefas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaView {

    ControllerTarefas tarefaController = new ControllerTarefas();

    @GetMapping
    public List<Tarefas> findAll() {
        return tarefaController.findAll();
    }

    @GetMapping("/{id}")
    public Tarefas getById(@PathVariable int id) {
        return tarefaController.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody Tarefas tarefa) {
        return tarefaController.insert(tarefa);
    }

    @PutMapping("/status/{id}")
    public boolean updateStatus(@PathVariable int id, @RequestBody String status) {
        return tarefaController.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return tarefaController.delete(id);
    }
}
