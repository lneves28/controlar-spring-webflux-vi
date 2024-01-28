package br.com.controlar.webflux.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControlarSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlarSpringApplication.class, args);
    }
    
    /*
     * # Configurações do MongoDB
#spring.data.mongodb.host=localhost
#spring.data.mongodb.port=27017
#spring.data.mongodb.database=dbwebflux

     */
  

}
