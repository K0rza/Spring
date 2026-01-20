package com.example.p01_sring_boot_mysql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.p01_sring_boot_mysql.dao.StudentDAO;
import com.example.p01_sring_boot_mysql.entity.Student;

@SpringBootApplication
public class P01SringBootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(P01SringBootMysqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDAO studentDAO) {
		return _ ->  {
			createStudent(studentDAO);
		};
	}

	private static void createStudent(StudentDAO studentDAO) {
		Student student = new Student("enes", "ilhan", "h_enes_1997@hotmail.com");

		System.out.println("Student template is created.");

		System.out.println("Database transaction is starting.");

		studentDAO.save(student);
		
		System.out.println("The student is saved to database. id: %s".formatted(student.getId()));
	}
}
