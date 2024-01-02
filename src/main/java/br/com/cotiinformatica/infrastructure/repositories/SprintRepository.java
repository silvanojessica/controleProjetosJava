package br.com.cotiinformatica.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.cotiinformatica.domain.models.Sprint;

public interface SprintRepository extends MongoRepository <Sprint, UUID>{

}
