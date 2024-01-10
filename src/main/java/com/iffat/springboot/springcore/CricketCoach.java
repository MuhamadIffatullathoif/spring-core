package com.iffat.springboot.springcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Cricket Couch Implementation interface Coach and method dailyWorkout";
    }
}
