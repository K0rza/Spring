package com.example.p04_update_database_with_entity_manager;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.p04_update_database_with_entity_manager.dao.StudentDao;

@SpringBootApplication
public class P04UpdateDatabaseWithEntityManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(P04UpdateDatabaseWithEntityManagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDao dao) {
		return _-> {
			updateStudentByName(dao, "ali", "veli");
		};
	}

	private void updateStudentByName(StudentDao dao, String name, String newName) {

		Optional.ofNullable(dao.findByName(name)).ifPresentOrElse(
			students -> students.forEach(student -> dao.updateByName(student, newName)),
			() -> System.err.println("Cannot find the Student from the database. Query-name : %s".formatted(name))
		);

	}

}
