package com.example.p02_read_object_with_jpa;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.p02_read_object_with_jpa.dao.StudentDao;

@SpringBootApplication
public class P02ReadObjectWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(P02ReadObjectWithJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDao dao) {
		return _ -> print(dao, 10);
	}

	private void print(StudentDao dao, int id) {
		Optional.ofNullable(dao.findById(id)).ifPresentOrElse(
			System.out::println, 
			() -> System.err.print("Cannot read the data from the db. The id : %s".formatted(id)));
	}
}
