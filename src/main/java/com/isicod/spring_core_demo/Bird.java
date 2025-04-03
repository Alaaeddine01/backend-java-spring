package com.isicod.spring_core_demo;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Bird implements Animal{

    public Bird(){
        System.out.println("In construction : "+getClass().getSimpleName());
    }


    @Override
    public String animalMakeSound() {
        return "The Bird make some sounds...";
    }
}
