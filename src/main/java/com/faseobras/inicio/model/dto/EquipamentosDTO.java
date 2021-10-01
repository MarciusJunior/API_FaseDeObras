package com.faseobras.inicio.model.dto;

import com.faseobras.inicio.model.Equipamentos;

public class EquipamentosDTO {
	
	private String id;
	private String equipamento;
	

	public EquipamentosDTO(Equipamentos obj) {
		super();
		this.id = obj.getId();
		this.equipamento = obj.getEquipamento();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	
	
	
	

}
