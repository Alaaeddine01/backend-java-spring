package com.isicod.spring_core_demo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public String animalMakeSound() {
        return "The Dog make some sounds...";
    }
}
