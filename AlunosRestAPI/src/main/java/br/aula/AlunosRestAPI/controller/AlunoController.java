package br.aula.AlunosRestAPI.controller;

import br.aula.AlunosRestAPI.request.RequestAluno;
import br.aula.AlunosRestAPI.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastroaluno (@RequestBody RequestAluno aluno){
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCPF());
        System.out.println("RA: " + aluno.getRA());

        service.save(aluno);
    }
    @GetMapping
    public List<RequestAluno> consultaaluno (){
        return service.findAll();
    }
}
