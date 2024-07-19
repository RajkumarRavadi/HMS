package com.example.hms;

import java.util.HashMap;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiClass {

    //creating a hashmap to store the data
    HashMap<Integer, Patient> patientDB = new HashMap<>();

    @GetMapping("getWeatherInfo")
    public String getWeatherInfo(){
        return "The temperature is 35.";
    }

    @GetMapping("sum")
    public ResponseEntity getSum(@RequestParam("num1") Integer no1,
                                 @RequestParam("num2") Integer no2){
        Integer total = no1 + no2;
        return new ResponseEntity(total, HttpStatusCode.valueOf(200));
    }

//    @PostMapping("addPatient")
//    public String  addPatient(@RequestBody Patient patient){
//        int key = patient.getPatientId();
//        //ADD THIS TO PATIENT DB
//        patientDB.put(key, patient);
//
//        return "The patient with key "+key+"has added to the BD";
//    }

    @GetMapping("getPatientInfo")
    public Patient getPatientInfo(@RequestParam("patientId") Integer patientId){
        Patient patient;
        patient = patientDB.get(patientId);
        return patient;
    }

    @DeleteMapping("deletePatientRecord")
    public String deletePatientRecord(@RequestParam("patientId") Integer patientId){
        patientDB.remove(patientId);
        return "The patient has been remove from the DB";
    }
}
