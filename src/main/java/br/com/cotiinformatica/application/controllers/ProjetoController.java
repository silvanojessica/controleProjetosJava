package br.com.cotiinformatica.application.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.domain.dtos.ProjetoGetDto;
import br.com.cotiinformatica.domain.dtos.ProjetoPostDto;
import br.com.cotiinformatica.domain.interfaces.ProjetoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/projeto")
public class ProjetoController {

	@Autowired
	ProjetoService projetoService;
	
	@PostMapping
	public UUID post(@RequestBody @Valid ProjetoPostDto dto) {
		return projetoService.criar(dto);
	}

	@GetMapping
	public List<ProjetoGetDto> get() {
		return projetoService.consultar();
	}

	@PutMapping
	public void put() {
		
	}
	
	@DeleteMapping
	public void delete() {
		
	}
}



