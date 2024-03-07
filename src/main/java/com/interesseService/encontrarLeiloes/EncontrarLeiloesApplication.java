package com.interesseService.encontrarLeiloes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.interesseService.encontrarLeiloes")
@EnableJpaRepositories(basePackages = "com.interesseService.encontrarLeiloes")
public class EncontrarLeiloesApplication {

	public static void main(String[] args) {

		SpringApplication.run(EncontrarLeiloesApplication.class, args);
	}

}
