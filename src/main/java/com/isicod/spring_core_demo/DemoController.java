package com.isicod.spring_core_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Animal animal;

    @Autowired
    public DemoController(Animal animal){
        this.animal = animal;
    }
    @GetMapping("/sounds")
    public String animalMakeSound(){
        return animal.animalMakeSound();
    }

}
