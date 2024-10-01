package br.aula.AlunosRestAPI.impl;

import br.aula.AlunosRestAPI.repository.AlunoRepository;
import br.aula.AlunosRestAPI.request.RequestAluno;
import br.aula.AlunosRestAPI.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    private AlunoRepository repository;

    @Autowired
    AlunoServiceImpl(AlunoRepository repository){
        this.repository = repository;
    }

    @Override
    public void save(RequestAluno aluno) {
        repository.save(aluno);
    }

    @Override
    public List<RequestAluno> findAll() {
        return repository.findAll();
    }
}
