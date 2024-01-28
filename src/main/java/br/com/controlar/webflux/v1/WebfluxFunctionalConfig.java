package br.com.controlar.webflux.v1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class WebfluxFunctionalConfig {
	
	@Autowired
	private ItemService itemService;

    @Bean
    public RouterFunction<ServerResponse> itemRoute(ItemService itemService) {
        return RouterFunctions.route(GET("/api/items").and(accept(MediaType.APPLICATION_JSON)), this::getAllItems);
    }

    private Mono<ServerResponse> getAllItems(ServerRequest request) {
        Flux<Item> items = itemService.getAllItems();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(items, Item.class);
    }
}
