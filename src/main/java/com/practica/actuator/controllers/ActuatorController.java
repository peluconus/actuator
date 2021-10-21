package com.practica.actuator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
	
	@GetMapping("/ejemplo")
	public String getEjemplo() {
		return "Hola a tod@s!";
	}

}
