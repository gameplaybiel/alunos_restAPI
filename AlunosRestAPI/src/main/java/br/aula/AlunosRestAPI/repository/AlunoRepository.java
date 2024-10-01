package br.aula.AlunosRestAPI.repository;

import br.aula.AlunosRestAPI.request.RequestAluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<RequestAluno, Integer> {
}
