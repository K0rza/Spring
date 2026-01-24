package com.example.p05_delete_database_with_hibernate_entity_manager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.p05_delete_database_with_hibernate_entity_manager.dao.StudentDao;

@SpringBootApplication
public class P05DeleteDatabaseWithHibernateEntityManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(P05DeleteDatabaseWithHibernateEntityManagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDao dao) {
		return _ -> {
			//deleteStudentById(dao, 5);
			deleteAllStudents(dao);
		};
	}

	private void deleteAllStudents(StudentDao dao) {
		System.out.println("Deleting all student from the database.");

		dao.removeAll();

		System.out.println("Database current status: ");
		dao.findAll().forEach(System.out::println);
	}

	private void deleteStudentById(StudentDao dao, int id) {
		System.out.println("Deleting the student with id: %s from the database.".formatted(id));

		dao.removeById(id);

		System.out.println("Database current status: ");
		dao.findAll().forEach(System.out::println);
	}

}
