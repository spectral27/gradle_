package org.example;

import jakarta.persistence.EntityManager;

import java.util.List;

public class JavaObjectRepository {

    private final EntityManager entityManager;

    public JavaObjectRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insertJavaObject(JavaObject javaObject) {
        entityManager.persist(javaObject);
    }

    public List<JavaObject> selectJavaObjects() {
        return entityManager.createQuery("select j from JavaObject j", JavaObject.class).getResultList();
    }

    public void updateJavaObject(int id, JavaObject updatedJavaObject) {
        JavaObject toUpdate = entityManager.find(JavaObject.class, id);
        toUpdate.setName(updatedJavaObject.getName());
    }

    public void deleteJavaObject(int id) {
        JavaObject toDelete = entityManager.find(JavaObject.class, id);
        entityManager.remove(toDelete);
    }

}
