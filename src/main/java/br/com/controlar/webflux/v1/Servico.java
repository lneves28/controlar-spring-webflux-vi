package br.com.controlar.webflux.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class Servico{

	@Autowired
	private Persistencia persistencia;
	
	
	public Mono<Livros> cadastrar(final Livros livros) {
		
		return persistencia.save(livros);
	}
	
	
	public Flux<Livros> consultarLivros(){
		
		return persistencia.findAll();
	}
	
	
	public Mono<Livros> consultarLivro(final String id){
		
		return persistencia.findById(id);
	}
}
