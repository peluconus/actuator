package com.practica.actuator.controllers;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "nombreCustom")
public class CustomEndpointController {
	
	@GetMapping("/otro")
	public ResponseEntity<String> getCustom(){
		return new ResponseEntity<>("Esto es un custom endpoint", HttpStatus.OK);
	}

}
