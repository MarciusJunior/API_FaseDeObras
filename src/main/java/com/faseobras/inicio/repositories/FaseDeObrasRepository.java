package com.faseobras.inicio.repositories;

import com.faseobras.inicio.model.FaseDeObras;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaseDeObrasRepository extends MongoRepository<FaseDeObras, String> {}
