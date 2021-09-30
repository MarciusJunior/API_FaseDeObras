package com.faseobras.inicio.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.services.EquipamentosService;

@RestController
@RequestMapping(value = "/equipamentos")
public class EquipamentosController{
	
	@Autowired
	private EquipamentosService service;

	@GetMapping
	public List<Equipamentos> todosEquipamentos() {
		
		return this.service.todosOsEquipamentos();
		
	}
	
	@GetMapping("/{id}")
	public Equipamentos equipamentosPorID(@PathVariable String id) {
		
		return this.service.equipamentosPorID(id);
		
	}
	
	@PostMapping
	public Equipamentos cadastroEquipamentos(@RequestBody Equipamentos equipamentos) {
		return this.service.cadastroEquipamentos(equipamentos);
	}
	
       
    
}
