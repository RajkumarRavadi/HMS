package com.example.hms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiClass {
    @GetMapping("getWeatherInfo")
    public String getWeatherInfo(){
        return "The temperature is 35.";
    }

    @GetMapping("sum")
    public Integer getSum(@RequestParam("num1") Integer no1,
                          @RequestParam("num2") Integer no2){
        Integer total = no1 + no2;
        return total;
    }
}
