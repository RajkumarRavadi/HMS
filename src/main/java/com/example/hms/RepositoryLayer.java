package com.example.hms;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
@Repository
public class RepositoryLayer {
    HashMap<Integer, Patient> patientDB = new HashMap<>();

    @PostMapping("addPatient")
    public String  addPatient(@RequestBody Patient patient){
        int key = patient.getPatientId();
        //ADD THIS TO PATIENT DB
        patientDB.put(key, patient);

        return "The patient with key "+key+"has added to the BD";
    }
}
