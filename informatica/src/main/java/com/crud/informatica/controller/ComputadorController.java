package com.crud.informatica.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.informatica.model.Computador;
import com.crud.informatica.service.InformaticaService;
import com.crud.informatica.service.InterfaceInformaticaService;

@CrossOrigin("*")
@RestController
public class ComputadorController {

	InterfaceInformaticaService service = new InformaticaService();

	@GetMapping("/computador")
	public List<Computador> getAll() {
		return service.getAll();
	}

	@GetMapping("/computador/{id}")
	public ResponseEntity<Computador> getById(@PathVariable int id) {

		Computador computador = service.getById(id);

		if (computador == null)
			ResponseEntity.notFound();

		return ResponseEntity.ok(computador);
	}
	
	@PostMapping("/computador")
	public ResponseEntity<Computador> insert(@RequestBody Computador computador){
		
		if(computador.getId() != 0) 
			return ResponseEntity.badRequest().body(computador);
		
		service.insert(computador);
		return ResponseEntity.ok(computador);
	}
	
	@PutMapping("/computador")
	public Computador update(@RequestBody Computador computador){
		
		service.update(computador);
		return computador;
		
	}
	
	@DeleteMapping("computador/{id}")
	public void delete(@PathVariable int id) { 
		
		service.delete(id);
	}
}
