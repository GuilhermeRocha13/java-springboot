package com.example.springwatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringwatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

			Systen.out.println("teste workflow")

	}
}
