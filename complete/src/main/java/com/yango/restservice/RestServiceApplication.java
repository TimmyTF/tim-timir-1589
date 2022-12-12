package com.yango.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    /*@Bean
    InMemoryHttpExchangeRepository httpExchangeRepository() {
        return new InMemoryHttpExchangeRepository();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
