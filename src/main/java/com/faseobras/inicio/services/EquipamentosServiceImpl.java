package com.faseobras.inicio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.model.FaseDeObras;
import com.faseobras.inicio.model.dto.FaseDeObrasDTO;
import com.faseobras.inicio.repositories.EquipamentosRepository;
import com.faseobras.inicio.repositories.FaseDeObrasRepository;
import com.faseobras.inicio.repositories.NomesDasFasesRepository;

@Service
public class EquipamentosServiceImpl implements EquipamentosService{

	@Autowired
	private EquipamentosRepository repo;
	
	@Autowired
	private FaseDeObrasRepository faseRepo;
	
	@Autowired
	private NomesDasFasesRepository nomeRepo;
	
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
		List<FaseDeObras> list = faseRepo.findAll();
		List<FaseDeObrasDTO> listDTO = list.stream().map(obj -> new FaseDeObrasDTO(obj)).collect(Collectors.toList());
		
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
