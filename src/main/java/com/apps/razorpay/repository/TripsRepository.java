package com.apps.razorpay.repository;


import com.apps.razorpay.model.Trips;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TripsRepository extends SimpleJpaRepository<Trips, String> {
    private final EntityManager em;
    public TripsRepository(EntityManager em) {
        super(Trips.class, em);
        this.em = em;
    }
    @Override
    public List<Trips> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Trips\"", Trips.class).getResultList();
    }
}