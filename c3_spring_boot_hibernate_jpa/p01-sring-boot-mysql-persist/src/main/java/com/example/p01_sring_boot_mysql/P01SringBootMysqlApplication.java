package com.example.p01_sring_boot_mysql;

import java.util.List;

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
			List.of(
				new Student("enes", "ilhan", "h_enes_1997@hotmail.com"),
				new Student("yasemin", "ilhan", "yaseminbilge01@gmail.com"),
				new Student("ali", "yilmaz", "yilmaz02@yahoo.com"),
				new Student("ahmet", "yildirim", "ayildirim@hotmail.com")
			).forEach(item -> createStudent(item, studentDAO));
		};
	}

	private static void createStudent(Student student, StudentDAO studentDAO) {
		System.out.println("Student template is created.");

		System.out.println("Database transaction is starting.");

		studentDAO.save(student);
		
		System.out.println("The student is saved to database. id: %s".formatted(student.getId()));
	}
}
