package br.com.leonardolamoia.gestao_vagas.repository;

import br.com.leonardolamoia.gestao_vagas.entities.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {


}
