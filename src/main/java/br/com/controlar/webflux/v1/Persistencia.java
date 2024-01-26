package br.com.controlar.webflux.v1;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Persistencia extends ReactiveMongoRepository<Livros, String>{

}
