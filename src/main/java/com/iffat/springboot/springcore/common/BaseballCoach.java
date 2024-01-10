package com.iffat.springboot.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Baseball coach implement Coach service in dailyworkout";
    }
}
