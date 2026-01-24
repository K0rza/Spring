package com.example.p05_delete_database_with_hibernate_entity_manager.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.p05_delete_database_with_hibernate_entity_manager.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    @Transactional
    public void removeById(int id) {
        Optional.ofNullable(findById(id)).ifPresentOrElse(
            student -> entityManager.remove(student),
            () -> System.err.println("Cannot find the student with id :%s to remove".formatted(id)));
    }

    @Override
    public List<Student> findAll() {
        return  entityManager.createQuery("FROM Student").getResultList();
    }

    @Override
    @Transactional
    public void removeAll() {
        entityManager.createQuery("DELETE Student").executeUpdate();
    }

    

}
