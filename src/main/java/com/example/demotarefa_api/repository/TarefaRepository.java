package com.example.demotarefa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demotarefa_api.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
