package com.apps.razorpay.repository;


import com.apps.razorpay.model.Person;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PersonRepository extends SimpleJpaRepository<Person, String> {
    private final EntityManager em;
    public PersonRepository(EntityManager em) {
        super(Person.class, em);
        this.em = em;
    }
    @Override
    public List<Person> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Person\"", Person.class).getResultList();
    }
}