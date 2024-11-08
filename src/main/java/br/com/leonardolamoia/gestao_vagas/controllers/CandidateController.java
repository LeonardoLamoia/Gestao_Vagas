package br.com.leonardolamoia.gestao_vagas.controllers;


import br.com.leonardolamoia.gestao_vagas.Entities.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidateEntity) {
    System.out.println("Candidato");
    System.out.println(candidateEntity.getEmail());
    }
}
