package com.faseobras.inicio.services;

import java.util.List;

import com.faseobras.inicio.model.Equipamentos;
import com.faseobras.inicio.model.FaseDeObras;
import com.faseobras.inicio.repositories.FaseDeObrasRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface FaseDeObrasService {

	public List<FaseDeObras> todasAsFasesDeObras();
	
	public FaseDeObras fasesDeObrasPorID(String id);
	
   public FaseDeObras cadastroFaseDeObras(FaseDeObras faseDeObras);
   
   public FaseDeObras cadastroDeEquipamentosPorFase(String id, String idEquipamentos);
   
   
   
   
    
}
