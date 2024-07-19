package com.example.hms;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLayer {
    @PostMapping("addPatient")
    public String  addPatient(@RequestBody Patient patient){
        ServiceLayer serviceLayerObj = new ServiceLayer();
        return serviceLayerObj.addPatient(patient);
    }
}
