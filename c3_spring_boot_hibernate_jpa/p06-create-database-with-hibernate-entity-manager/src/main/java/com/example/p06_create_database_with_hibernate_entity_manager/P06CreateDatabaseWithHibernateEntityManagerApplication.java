package com.example.p06_create_database_with_hibernate_entity_manager;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.p06_create_database_with_hibernate_entity_manager.dao.StudentDao;
import com.example.p06_create_database_with_hibernate_entity_manager.entity.Student;

@SpringBootApplication
public class P06CreateDatabaseWithHibernateEntityManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(P06CreateDatabaseWithHibernateEntityManagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDao dao) {
		return _ -> {
			createMultipleStudents(dao);
		};
	}

	private void createMultipleStudents(StudentDao dao) {
		System.out.println("The student table will be created from the scratch.");

		List.of(
				new Student("enes", "ilhan", "h_enes_1997@hotmail.com"),
				new Student("yasemin", "ilhan", "yaseminbilge01@gmail.com"),
				new Student("ali", "yilmaz", "yilmaz02@yahoo.com"),
				new Student("ahmet", "yildirim", "ayildirim@hotmail.com")
			).forEach(item -> createStudent(item, dao));
		
		System.out.println("The database table created. Updated database: ");
		dao.findAll().forEach(System.out::println);
	}

	private void createStudent(Student student, StudentDao dao) {
		System.out.println("The student is adding to database with id: %s".formatted(student.getId()));

		dao.create(student);
	}

}
