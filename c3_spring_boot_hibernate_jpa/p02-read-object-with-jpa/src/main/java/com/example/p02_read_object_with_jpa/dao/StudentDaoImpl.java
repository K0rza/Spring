package com.example.p02_read_object_with_jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.p02_read_object_with_jpa.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {this.entityManager = entityManager; }
    
    @Override
    @Transactional
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

}
