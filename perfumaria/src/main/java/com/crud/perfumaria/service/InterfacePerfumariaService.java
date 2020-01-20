package com.crud.perfumaria.service;

import java.util.List;

import com.crud.perfumaria.model.Perfume;

public interface InterfacePerfumariaService {
	
	public List<Perfume> getAll();
	
	public Perfume getById(int id);
	
	public Perfume insert(Perfume perfume);
	
	public void delete(int id);
	
	public Perfume update(Perfume perfume);
}
