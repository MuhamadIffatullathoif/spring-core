package com.iffat.springboot.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "TrackCouch implement Coach in dailyworkout";
    }
}
