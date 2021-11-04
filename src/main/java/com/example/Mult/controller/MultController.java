package com.example.Mult.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MultController {
	
	
	
	@GetMapping("/mult")
	public Double multiplicacao(Double n1, Double n2) {
		return n1*n2;
	}
	@GetMapping("/soma")
	public Double soma(Double n1, Double n2) {
		return n1+n2;
	}
	@GetMapping("/sub")
	public Double subtracao(Double n1, Double n2) {
		return n1-n2;
	}
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

}
