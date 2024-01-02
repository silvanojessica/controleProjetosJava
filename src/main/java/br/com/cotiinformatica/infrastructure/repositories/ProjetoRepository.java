package br.com.cotiinformatica.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.domain.models.Projeto;

@Repository
public interface ProjetoRepository extends MongoRepository <Projeto, UUID>{

}
