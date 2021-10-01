package com.faseobras.inicio.repositories;



import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.faseobras.inicio.model.FaseDeObras;
import com.faseobras.inicio.model.dto.FaseDeObrasDTO;

@Repository
public interface NomesDasFasesRepository extends MongoRepository<FaseDeObrasDTO, String>{}
