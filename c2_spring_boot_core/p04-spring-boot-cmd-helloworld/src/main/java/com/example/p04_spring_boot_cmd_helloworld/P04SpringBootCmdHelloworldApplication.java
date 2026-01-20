package com.example.p04_spring_boot_cmd_helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class P04SpringBootCmdHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(P04SpringBootCmdHelloworldApplication.class, args);
	}

	@Bean
	public CommandLineRunner sayHelloWorld() {
		return _-> {
			System.out.println("Hello World");
		};
	}

}
