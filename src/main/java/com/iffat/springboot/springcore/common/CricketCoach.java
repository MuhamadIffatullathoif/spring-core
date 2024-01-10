package com.iffat.springboot.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("in constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Couch Implementation interface Coach and method dailyWorkout";
    }
}
