package br.com.cotiinformatica.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/sprint")
public class SprintController {

	@PostMapping
	public void post() {
		
	}
	
	@GetMapping
	public void get() {
		
	}
}
