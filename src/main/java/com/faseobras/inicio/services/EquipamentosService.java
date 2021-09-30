package com.faseobras.inicio.services;

import java.util.List;

import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.repositories.EquipamentosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface EquipamentosService {

	public List<Equipamentos> todosOsEquipamentos();
	
	public Equipamentos equipamentosPorID(String id);
	
    public Equipamentos cadastroEquipamentos(Equipamentos equipamentos) ;
    
}
