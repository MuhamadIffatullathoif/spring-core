package com.iffat.springboot.springcore.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("in constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "SwimCoach implement Coach";
    }
}
