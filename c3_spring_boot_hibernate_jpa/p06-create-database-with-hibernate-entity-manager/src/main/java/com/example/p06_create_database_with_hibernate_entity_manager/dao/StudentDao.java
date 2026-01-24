package com.example.p06_create_database_with_hibernate_entity_manager.dao;

import java.util.List;

import com.example.p06_create_database_with_hibernate_entity_manager.entity.Student;

public interface StudentDao {

    void create(Student student);

    List<Student> findAll();

}
