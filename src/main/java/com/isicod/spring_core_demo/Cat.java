package com.isicod.spring_core_demo;


import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    public Cat() {
        System.out.println("In construction : "+getClass().getSimpleName());
    }

    @Override
    public String animalMakeSound() {
        return "The Cat make some sounds...";
    }

}
