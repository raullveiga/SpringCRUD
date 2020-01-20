package com.crud.informatica.model;

public class Computador {
	
	private int id;
	
	private String modelo;
	
	private String marca;

	public Computador () {
		
	}
	
	public Computador( String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
