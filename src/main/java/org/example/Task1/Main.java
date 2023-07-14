package org.example.Task1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
//        EntityManager em = emf.createEntityManager();
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
             EntityManager em = emf.createEntityManager()){
            Car veh = new Car("benz", BigDecimal.valueOf(111), "bmw", 5);
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
