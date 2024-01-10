package com.iffat.springboot.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCouch implements Coach {
    @Override
    public String getDailyWorkout() {
        return "TennisCoach implement Coach in dailyworkout";
    }
}
