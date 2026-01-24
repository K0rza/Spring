package com.example.p03_query_database_with_jpaql;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.p03_query_database_with_jpaql.dao.StudentDao;

@SpringBootApplication
public class P03QueryDatabaseWithJpaqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(P03QueryDatabaseWithJpaqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDao dao) {
		//return _ -> findStudentByName(dao, "enes");
		return _ -> findStudentByEmail(dao, "hotmail");
	}

	private void findStudentByEmail(StudentDao dao, String email) {
		Optional.ofNullable(dao.findByEmail(email)).ifPresentOrElse(
			vals -> vals.forEach(System.out::println),
			() -> System.err.println("Cannot find the student with given email: %s".formatted(email)));
	}

	private void findStudentByName(StudentDao dao, String name) {
		Optional.ofNullable(dao.findByName(name)).ifPresentOrElse(
			vals -> vals.forEach(System.out::println),
			() -> System.err.println("Cannot find the student with given name: %s".formatted(name)));
	}

}
