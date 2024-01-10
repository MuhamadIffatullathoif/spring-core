package com.iffat.springboot.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCouch implements Coach {

    public TennisCouch() {
        System.out.println("in constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "TennisCoach implement Coach in dailyworkout";
    }
}
