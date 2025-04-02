package com.isicod.spring_core_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {
    public Dog() {
        System.out.println("In construction : "+getClass().getSimpleName());
    }

    @Override
    public String animalMakeSound() {
        return "The Dog make some sounds...";
    }
}
