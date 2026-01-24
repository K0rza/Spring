package com.example.p05_delete_database_with_hibernate_entity_manager.dao;

import java.util.List;

import com.example.p05_delete_database_with_hibernate_entity_manager.entity.Student;

public interface StudentDao {

    Student findById(int id);

    List<Student> findAll();

    void removeById(int id);

    void removeAll();
}
