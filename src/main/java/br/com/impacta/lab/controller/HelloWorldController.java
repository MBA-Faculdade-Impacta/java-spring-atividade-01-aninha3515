package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class HelloWorldController {

	@GetMapping("hello")
	public ResponseEntity<String> helloWorld() {


    int numero1=15;
		
		//Digite -> Hello world !
		return ResponseEntity.ok("Hello world !!!");
	}
	
}
