package com.example.p03_query_database_with_jpaql.dao;

import java.util.List;

import com.example.p03_query_database_with_jpaql.entity.Student;

public interface StudentDao {

    List<Student> findByName(String name);

    List<Student> findByEmail(String email);
}
