package com.faseobras.inicio.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.model.FaseDeObras;
import com.faseobras.inicio.repositories.EquipamentosRepository;
import com.faseobras.inicio.repositories.FaseDeObrasRepository;

@Service
public class FaseDeObrasServiceImpl implements FaseDeObrasService{
	
	@Autowired
	private FaseDeObrasRepository repo;
	
	@Autowired
	private EquipamentosRepository equipRepo;

	@Override
	public FaseDeObras cadastroFaseDeObras(FaseDeObras faseDeObras) {
		return this.repo.save(faseDeObras);
	}

	@Override
	public List<FaseDeObras> todasAsFasesDeObras() {
		return this.repo.findAll();
	}

	@Override
	public FaseDeObras fasesDeObrasPorID(String id) {
		return this.repo
				.findById(id).orElseThrow(() -> new IllegalArgumentException("Fase de Obra não existe!"));
	}
	
	@Override
	public FaseDeObras cadastroDeEquipamentosPorFase(String id, String idEquipamentos) {
		
		FaseDeObras idObra = fasesDeObrasPorID(id);
		
		List<Equipamentos> listAux = idObra.getEquipamentos();
		
		Optional<Equipamentos> equipamentos = equipRepo.findById(idEquipamentos);
		if(equipamentos.isPresent()) {
			listAux.add(equipamentos.get());
		}
		
		
		idObra.setEquipamentos(listAux);
		
		return cadastroFaseDeObras(idObra);
		
		
				
	}
	
	

}
