package com.crud.perfumaria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.perfumaria.model.Perfume;
import com.crud.perfumaria.service.InterfacePerfumariaService;
import com.crud.perfumaria.service.PerfumariaService;

@RestController
public class PerfumariaController {
	
	private InterfacePerfumariaService service = new PerfumariaService();
	
	@GetMapping("/perfume")
	public ResponseEntity<List<Perfume>> getAll() {
		List<Perfume> rt = service.getAll();
		
		if(rt == null)
			 ResponseEntity.noContent(); 
		return ResponseEntity.ok(service.getAll());
		
	}
	
	@GetMapping("/perfume/{id}")
	public ResponseEntity<Perfume> getById(@PathVariable int id){
		
		Perfume rt = service.getById(id);
		if(rt == null)
			 return ResponseEntity.status(404).body(rt);
		return ResponseEntity.ok(rt);
	}
	
	@PostMapping("/perfume")
	public ResponseEntity<Perfume> insert(@RequestBody Perfume perfume){
		Perfume rt = service.insert(perfume);
		
		if(rt == null) 
			return ResponseEntity.badRequest().body(perfume);
		return ResponseEntity.ok(rt);
	}
	
	@PutMapping("/perfume")
	public ResponseEntity<Perfume> update(@RequestBody Perfume perfume){
		Perfume rt = service.update(perfume);
		
		if(rt == null)
			ResponseEntity.badRequest().body(perfume);
		return ResponseEntity.ok(rt);
	}
	
	@DeleteMapping("/perfume/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
		
	}
}
