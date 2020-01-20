package com.crud.perfumaria.service;

import java.util.ArrayList;
import java.util.List;

import com.crud.perfumaria.model.Perfume;

public class PerfumariaService implements InterfacePerfumariaService {

	static List<Perfume> perfumes = new ArrayList<Perfume>();

	public List<Perfume> getAll() {

		return perfumes;
	}

	public Perfume getById(int id) {
		for (Perfume perfume : perfumes) {
			if (perfume.getId() == id)
				return perfume;
		}
		return null;
	}

	public Perfume insert(Perfume perfume) {
		if (perfume.getId() == 0)
			if (perfume != null) {
				perfume.setId();
				perfumes.add(perfume);
				return perfume;
			}

		return null;
	}

	public void delete(int id) {

		Perfume rm = getById(id);
		perfumes.remove(rm);
	}

	public Perfume update(Perfume perfume) {

		Perfume att = getById(perfume.getId());

		if (att != null) {
			att.setMarca(perfume.getMarca());
			att.setNome(perfume.getNome());
			return att;
		}

		return null;
	}

}
