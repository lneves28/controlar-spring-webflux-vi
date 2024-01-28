package br.com.controlar.webflux.v1;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class ItemService {
	
    public Flux<Item> getAllItems() {
        return Flux.just(
                new Item("1", "Item 1"),
                new Item("2", "Item 2"),
                new Item("3", "Item 3")
        );
    }
    
}
