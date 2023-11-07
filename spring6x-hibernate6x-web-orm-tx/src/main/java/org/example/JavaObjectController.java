package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/objects")
public class JavaObjectController {

    @Autowired
    private JavaObjectService service;

    @GetMapping
    public ResponseEntity<?> selectAll() {
        return new ResponseEntity<>(service.selectJavaObjects(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody JavaObject javaObject) {
        service.insertJavaObject(javaObject);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody JavaObject javaObject) {
        service.updateJavaObject(id, javaObject);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        service.deleteJavaObject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
