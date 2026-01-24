package com.example.p03_query_database_with_jpaql.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.p03_query_database_with_jpaql.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private EntityManager entityManager;
        
    @Override
    public List<Student> findByName(String name) {
        TypedQuery<Student> query = entityManager.createQuery("select s FROM Student s WHERE s.firstName=:data", Student.class);
        
        query.setParameter("data", name);

        return query.getResultList();
    }

    @Override
    public List<Student> findByEmail(String email) {
        TypedQuery<Student> query = entityManager.createQuery("select s FROM Student s WHERE s.email LIKE :data order by firstName asc", Student.class);

        query.setParameter("data", "%" + email + "%");

        return query.getResultList();
    }

}
