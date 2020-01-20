package com.crud.informatica.service;

import java.util.List;

import com.crud.informatica.model.Computador;

public interface InterfaceInformaticaService {
	
	Computador insert(Computador computador);
	
	Computador update(Computador computador);
	
	void delete(Computador computador);
	
	void delete(int id);
	
	Computador getById(int id);
	
	List<Computador> getAll();
}
