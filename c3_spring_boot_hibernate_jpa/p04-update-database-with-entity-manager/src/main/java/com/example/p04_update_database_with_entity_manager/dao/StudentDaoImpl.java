package com.example.p04_update_database_with_entity_manager.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.p04_update_database_with_entity_manager.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> findByName(String name) {
        TypedQuery<Student> query = entityManager.createQuery(
            "select s FROM Student s WHERE s.firstName=:data",
            Student.class);

        query.setParameter("data", name);

        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateByName(Student student, String newName) {

        student.setFirstName(newName);

        entityManager.merge(student);
    }

}
