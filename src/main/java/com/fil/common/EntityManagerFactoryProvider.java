package com.fil.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProvider {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager =null;
    public static EntityManager getEntityManagerFactory() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            return entityManager;
        }else{
            entityManagerFactory = Persistence.createEntityManagerFactory("fil");
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }
}
