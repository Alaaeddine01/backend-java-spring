package com.isicod.spring_core_demo;


import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

    @Override
    public String animalMakeSound() {
        return "The Cat make some sounds...";
    }
}
