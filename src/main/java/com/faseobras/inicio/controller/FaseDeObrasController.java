package com.faseobras.inicio.controller;


import java.util.List;

import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.model.FaseDeObras;
import com.faseobras.inicio.services.FaseDeObrasService;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fasedeobras")
public class FaseDeObrasController {

	@Autowired
   private FaseDeObrasService service;
	
	@GetMapping
	public List<FaseDeObras> todasAsFasesDeObras() {
		
		return this.service.todasAsFasesDeObras();
		
	}
	
	@GetMapping("/{id}")
	public FaseDeObras fasesDeObrasPorID(@PathVariable String id ) {
		
		return this.service.fasesDeObrasPorID(id);
		
	}
	
	@PostMapping
	public FaseDeObras cadastroFaseDeObras(@RequestBody FaseDeObras faseDeObras) {
		
		return this.service.cadastroFaseDeObras(faseDeObras);
		
	}
	
	@PutMapping("/{id}/{idEquipamentos}")
	public FaseDeObras cadastroDeEquipamentosPorFase(@PathVariable String id,@PathVariable String idEquipamentos) {
		return this.service.cadastroDeEquipamentosPorFase(id, idEquipamentos);
	}
    
}
