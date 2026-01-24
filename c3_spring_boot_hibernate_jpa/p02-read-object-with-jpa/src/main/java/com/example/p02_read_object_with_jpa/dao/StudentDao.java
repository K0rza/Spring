package com.example.p02_read_object_with_jpa.dao;

import com.example.p02_read_object_with_jpa.entity.Student;

public interface StudentDao {

    Student findById(int id);

}
