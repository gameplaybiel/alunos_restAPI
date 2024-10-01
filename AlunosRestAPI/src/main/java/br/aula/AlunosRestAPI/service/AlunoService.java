package br.aula.AlunosRestAPI.service;

import br.aula.AlunosRestAPI.request.RequestAluno;

import java.util.List;

public interface AlunoService {

    void save(RequestAluno aluno);

    List<RequestAluno> findAll();
}
