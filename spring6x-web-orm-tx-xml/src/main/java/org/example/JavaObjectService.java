package org.example;

import java.util.List;

public class JavaObjectService {

    private final JavaObjectRepository repository;

    public JavaObjectService(JavaObjectRepository javaObjectRepository) {
        this.repository = javaObjectRepository;
    }

    public void insertJavaObject(JavaObject javaObject) {
        repository.insertJavaObject(javaObject);
    }

    public List<JavaObject> selectJavaObjects() {
        return repository.selectJavaObjects();
    }

    public void updateJavaObject(int id, JavaObject updatedJavaObject) {
        repository.updateJavaObject(id, updatedJavaObject);
    }

    public void deleteJavaObject(int id) {
        repository.deleteJavaObject(id);
    }

}
