package com.rosh.akar.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class JokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesApplication.class, args);
	}
}
