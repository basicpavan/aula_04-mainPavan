package com.biopark.tarefas.service;

import com.biopark.tarefas.model.Tarefa;
import com.biopark.tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;


    public List<Tarefa> listarPendentes() {
        // Assumindo que você tenha um atributo boolean 'concluida'
        return repository.findByConcluidaFalse();
    }

    public List<Tarefa> listarConcluidas() {
        return repository.findByConcluidaTrue();
    }

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return tarefaRepository.findById(id);
    }

    public void excluir(Long id) {
        tarefaRepository.deleteById(id);
    }

    public void alterarStatus(Long id) {
        tarefaRepository.findById(id).ifPresent(tarefa -> {
            tarefa.setConcluida(!tarefa.getConcluida());
            tarefaRepository.save(tarefa);
        });
    }
}
