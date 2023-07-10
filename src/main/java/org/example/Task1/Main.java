//package org.example.Task1;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//
//import java.math.BigDecimal;
//
//class Main {
//    public static void main(String[] args) {
//        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
//        EntityManager em = emf.createEntityManager()){
//            Plane p1 = new Plane("Plane", "Airbus A321neo", BigDecimal.valueOf(50000), "Diesel", "S7", 125);
//            Vehicle b1 = new Bike();
//            try {
//                em.getTransaction().begin();
//                em.persist(p1);
//                em.getTransaction().commit();
//            } catch (Exception e) {
//                if (em.getTransaction() != null)
//                    em.getTransaction().rollback();
//                throw e;
//            }
//        }
//    }
//}