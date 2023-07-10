//package org.example.Task3;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//
//public class Main {
//    public static void main(String[] args) {
//        try (EntityManagerFactory emf = Persistence
//                .createEntityManagerFactory("hibernate"); EntityManager em = emf
//                .createEntityManager()){
//            Vehicle veh = new Vehicle();
//            try {
//                em.getTransaction().begin();
//                em.persist(veh);
//                em.getTransaction().commit();
//            } catch (Exception e) {
//                if (em.getTransaction() != null)
//                    em.getTransaction().rollback();
//                throw e;
//            }
//        }
//    }
//}
