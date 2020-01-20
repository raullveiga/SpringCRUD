package com.crud.mercado.model;

import java.math.BigDecimal;

public class Produto {
	
	static private int incr = 0;
	
	private int id = 0;
	
	private String nome;
	
	private BigDecimal preco;

	public Produto(String nome, BigDecimal preco) {
		super();
		setId();
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		if(this.id == 0) {
			this.id = incr++;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
}
