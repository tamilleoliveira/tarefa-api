package com.example.demotarefa_api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demotarefa_api.model.Tarefa;
import com.example.demotarefa_api.repository.TarefaRepository;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    // Criar tarefa
    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return repository.save(tarefa);
    }

    // Listar todas
    @GetMapping
    public List<Tarefa> listar() {
        return repository.findAll();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // Atualizar
    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return repository.findById(id).map(t -> {
            t.setNome(tarefa.getNome());
            t.setDataEntrega(tarefa.getDataEntrega());
            t.setResponsavel(tarefa.getResponsavel());
            return repository.save(t);
        }).orElse(null);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
