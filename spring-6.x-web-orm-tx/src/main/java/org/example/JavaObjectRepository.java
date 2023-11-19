package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JavaObjectRepository {

    @PersistenceContext
    private EntityManager entityManager;

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
