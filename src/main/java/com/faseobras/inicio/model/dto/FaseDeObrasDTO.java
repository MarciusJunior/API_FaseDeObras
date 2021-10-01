package com.faseobras.inicio.model.dto;

import com.faseobras.inicio.model.FaseDeObras;

public class FaseDeObrasDTO {
	
	private String id;
	private String nomeDaFase;
	
	public FaseDeObrasDTO() {
		super();
	}

	public FaseDeObrasDTO(FaseDeObras obj) {
		super();
		this.id = obj.getId();
		this.nomeDaFase = obj.getNomeDaFase();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeDaFase() {
		return nomeDaFase;
	}

	public void setNomeDaFase(String nomeDaFase) {
		this.nomeDaFase = nomeDaFase;
	}
	
	

}
