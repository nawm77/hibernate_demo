package org.example.Task2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
             EntityManager em = emf.createEntityManager()){
            Vehicle veh = new Car("benz", BigDecimal.valueOf(111), "bmw", 5);
            try {
                em.getTransaction().begin();
                em.persist(veh);
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }
        }
    }
}
