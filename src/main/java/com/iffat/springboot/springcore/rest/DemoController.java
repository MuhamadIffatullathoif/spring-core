package com.iffat.springboot.springcore.rest;

import com.iffat.springboot.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach coach) {
        System.out.println("in constructor " + getClass().getSimpleName());
        this.myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
