package com.faseobras.inicio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.model.FaseDeObras;
import com.faseobras.inicio.repositories.EquipamentosRepository;
import com.faseobras.inicio.repositories.FaseDeObrasRepository;

@Service
public class EquipamentosServiceImpl implements EquipamentosService{

	@Autowired
	private EquipamentosRepository repo;
	
	@Autowired
	private FaseDeObrasRepository faseRepo;
	
	
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

	@Override
	public Equipamentos cadastroDeFaseDeObrasPorEquipamento(String id, String idFaseDeObras) {
		
		Equipamentos idEquip = equipamentosPorID(id);
		
		
		List<FaseDeObras> listAux = idEquip.getFaseDeObras();
		
		Optional<FaseDeObras> faseDeObras = faseRepo.findById(idFaseDeObras);
		if(faseDeObras.isPresent()) {
			
			listAux.add(faseDeObras.get());
		}
		
		idEquip.setFaseDeObras(listAux);
		
		
		return cadastroEquipamentos(idEquip);
	}
	
	

}
