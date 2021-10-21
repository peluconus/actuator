package com.practica.actuator.model;

public class Ejemplo {

	private String nombre;
	private Integer valor;
	private Double precio;
	private String descripcion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Ejemplo(String nombre, Integer valor, Double precio, String descripcion) {
		super();
		this.nombre = nombre;
		this.valor = valor;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String toString() {
		return "Ejemplo [nombre=" + nombre + ", valor=" + valor + ", precio=" + precio + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
