package com.example.hms;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ServiceLayer {
    @PostMapping("addPatient")
    public String  addPatient(@RequestBody Patient patient){
        RepositoryLayer repositoryLayerObj = new RepositoryLayer();
        return repositoryLayerObj.addPatient(patient);
    }
}
