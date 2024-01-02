package br.com.cotiinformatica.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ProjetoPostDto {
	
	@NotBlank(message = "O nome do projeto é obrigatório!")
	private String nome;
	
	@NotBlank(message = "O escopo não deve ficar em branco")
	private String escopo;
	
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",
			message = "Informe a data de entrega no formato YYYY-MM-DD")
	@NotBlank(message = "Informe a data de entrega do projeto.")
	private String dataEntrega;
	

}
