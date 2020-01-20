package com.crud.informatica.service;

import java.util.ArrayList;
import java.util.List;

import com.crud.informatica.model.Computador;

public class InformaticaService implements InterfaceInformaticaService {

	static List<Computador> computadores = new ArrayList<Computador>();
	
	private static int incr = 0;

	@Override
	public Computador insert(Computador computador) {
		incr++;
		computador.setId(incr);
		this.computadores.add(computador);

		return computador;
	}

	@Override
	public Computador update(Computador computador) {

		Computador rt = getById(computador.getId());

		if (rt != null) {
			rt.setMarca(computador.getMarca());
			rt.setModelo(computador.getModelo());
		}

		return null;
	}

	@Override
	public void delete(Computador computador) {
		computadores.remove(computador);
	}

	@Override
	public void delete(int id) {
		int pos = -1;

		for (int i = 0; i < this.computadores.size(); i++) {
			if (this.computadores.get(i).getId() == id) {
				pos = i;
				break;
			}
		}
		if (pos > 0) {
			this.computadores.remove(pos);
		}
	}

	@Override
	public Computador getById(int id) {

		for (Computador computador : computadores) {
			if (computador.getId() == id) {
				return computador;
			}
		}

		return null;
	}

	@Override
	public List<Computador> getAll() {

		return computadores;
	}

}
