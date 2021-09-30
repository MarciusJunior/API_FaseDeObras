package com.faseobras.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.faseobras.inicio.repositories")
public class FaseobrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaseobrasApplication.class, args);
	}

}
