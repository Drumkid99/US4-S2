package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HolaMundoController {
	
	@RequestMapping("/saludar")
	public String saludar () {
		return "Hola mundo!123";
	}
}
