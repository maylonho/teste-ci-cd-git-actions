package br.com.oliveira.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oliveira.SimpleMath;


@RestController
public class MathController {
	SimpleMath math = new SimpleMath();
	
	@GetMapping("teste")
	public String teste() {
		return "teste do reload, agora vaaaai";
	}

	@GetMapping("/sum/{firtNumber}/{secoundNumber}")
	public Double sum(
			@PathVariable String firtNumber,
			@PathVariable String secoundNumber
			) {
		
		return math.sum(Double.parseDouble(firtNumber), Double.parseDouble(secoundNumber));
	}
	

	@GetMapping("/subtraction/{firtNumber}/{secoundNumber}")
	public Double subtraction(
			@PathVariable String firtNumber,
			@PathVariable String secoundNumber
			) {
		
		return math.subtraction(Double.parseDouble(firtNumber), Double.parseDouble(secoundNumber));
	}
	

	@GetMapping("/multiplication/{firtNumber}/{secoundNumber}")
	public Double multiplication(
			@PathVariable String firtNumber,
			@PathVariable String secoundNumber
			) {
		
		return math.multiplication(Double.parseDouble(firtNumber), Double.parseDouble(secoundNumber));
	}
	

	@GetMapping("/division/{firtNumber}/{secoundNumber}")
	public Double division(
			@PathVariable String firtNumber,
			@PathVariable String secoundNumber
			) {
		
		return math.division(Double.parseDouble(firtNumber), Double.parseDouble(secoundNumber));
	}
	

	

	@PostMapping("/division/{firtNumber}/{secoundNumber}")
	public String dividir(
			@PathVariable String firtNumber,
			@PathVariable String secoundNumber
			) {
		
		return "O valor é: " + math.division(Double.parseDouble(firtNumber), Double.parseDouble(secoundNumber));
	}
}
