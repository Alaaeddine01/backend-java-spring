package com.isicod.spring_core_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Animal animal;

    @Autowired
    public DemoController( @Qualifier("cat") Animal animal){
        this.animal = animal;
    }

    /*
    behind the scenes for the construction injection:

    Animal animal = new Cat();
    DemoController demoController = new DemoController(animal);



     */


    @GetMapping("/sounds")
    public String animalMakeSound(){
        return animal.animalMakeSound();
    }


}
