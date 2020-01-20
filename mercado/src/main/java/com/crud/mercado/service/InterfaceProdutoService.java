package com.crud.mercado.service;

import java.util.List;

import com.crud.mercado.model.Produto;

public interface InterfaceProdutoService {
	
	List<Produto> getAll();
	
	Produto getById(int id);
	
	Produto insert(Produto produto);
	
	Produto update(Produto produto);
	
	void delete(int id);
}
