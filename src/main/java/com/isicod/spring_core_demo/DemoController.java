package com.isicod.spring_core_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Animal animal;
    // @Qualifier has higher priority than @Primary
    @Autowired
    public DemoController( @Qualifier("cat") Animal animal){
        this.animal = animal;
    }

    /*
    behind the scenes for the construction injection:

    Animal animal = new Cat(); //Cat class implement the Animal interface !
    DemoController demoController = new DemoController(animal);



     */


    @GetMapping("/sounds")
    public String animalMakeSound(){
        return animal.animalMakeSound();
    }


}
