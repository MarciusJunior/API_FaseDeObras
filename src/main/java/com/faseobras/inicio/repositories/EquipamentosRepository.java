package com.faseobras.inicio.repositories;

import com.faseobras.inicio.model.Equipamentos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipamentosRepository extends MongoRepository<Equipamentos, String> {}
