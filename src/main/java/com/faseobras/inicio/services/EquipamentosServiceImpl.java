package com.faseobras.inicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.repositories.EquipamentosRepository;

@Service
public class EquipamentosServiceImpl implements EquipamentosService{

	@Autowired
	private EquipamentosRepository repo;
	
	@Override
	public Equipamentos cadastroEquipamentos(Equipamentos equipamentos) {
		
		return this.repo.save(equipamentos);
	}

	@Override
	public List<Equipamentos> todosOsEquipamentos() {
		return this.repo.findAll();
	}

	@Override
	public Equipamentos equipamentosPorID(String id) {
		return this.repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Equipamento não existe!"));
	}
	
	

}
