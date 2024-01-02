package br.com.cotiinformatica.domain.models;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="equipe")
public class Equipe {
	
	@Id
	private UUID id;
	private String nome;
	private List <MembroEquipe> membros;
	//private Projeto projeto; (esse vínculo não é obrigatório, porque o banco é noSQL)

}
