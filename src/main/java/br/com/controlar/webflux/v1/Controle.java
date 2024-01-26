package br.com.controlar.webflux.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/controlar-webflux")
public class Controle {

	@Autowired
	private Servico servico;
	
	
	@PostMapping("/cadastrar")
	public Mono<Livros> cadastrar(@RequestBody Livros livros){
		
		return servico.cadastrar(livros);
	}
	
	@GetMapping("/consultar")
	public Flux<Livros> consultarLivros(){
		
		return servico.consultarLivros();
	}
	
	@GetMapping("/consultarLivro")
	public Mono<Livros> consultarLivros(@RequestParam String id){
		
		return servico.consultarLivro(id);
	}
}
