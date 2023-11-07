package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JavaObjectService {

    @Autowired
    private JavaObjectRepository repository;

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
