package com.example.p04_update_database_with_entity_manager.dao;

import java.util.List;

import com.example.p04_update_database_with_entity_manager.entity.Student;

public interface StudentDao {

    List<Student> findByName(String name);

    void updateByName(Student student, String newName);

}
