package com.crud.mercado.service;

import java.util.ArrayList;
import java.util.List;

import com.crud.mercado.model.Produto;

public class ProdutoService implements InterfaceProdutoService{

	List<Produto> produtos = new ArrayList();
	
	@Override
	public List<Produto> getAll() {
		
		return produtos;
	}

	@Override
	public Produto getById(int id) {
		for (Produto produto : produtos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

	@Override
	public Produto insert(Produto produto) {
		if(produto != null)
			if(produto.getId() != 0)
				produtos.add(produto);
		return null;
	}

	@Override
	public Produto update(Produto produto) {
		
		return null;
	}

	@Override
	public void delete(int id) {
		
		
	}

		
}
