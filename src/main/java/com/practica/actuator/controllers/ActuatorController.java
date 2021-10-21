package com.practica.actuator.controllers;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practica.actuator.model.Ejemplo;

@Component
@RestControllerEndpoint(id = "controllerEjemplo")
public class ActuatorController {
	
	@GetMapping("/ejemplo")
	public String getEjemplo() {
		return "Hola a tod@s!";
	}
	
	@GetMapping("/ejemplo2/{nombre}")
	public String getEjemplo2(@PathVariable String nombre) {
		return "El segundo ejemplo: "+nombre;
	}
	
	@GetMapping("/ejemplo3/{nombre}/{id}")
	public String getEjemplo3(@PathVariable String nombre, Integer id) {
		return "El tercer ejemplo: "+nombre+" - "+id.toString();
	}
	
	@GetMapping("/ejemplo4/{nombre}/{valor}/{precio}/{descripcion}")
	public String getEjemplo4(@PathVariable String nombre, Integer valor, Double precio, String descripcion) {
		Ejemplo e = new Ejemplo(nombre, valor, precio, descripcion);
		return e.toString();
	}
	

}
