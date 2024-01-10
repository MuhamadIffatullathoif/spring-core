package com.iffat.springboot.springcore.rest;

import com.iffat.springboot.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach coach,
                          @Qualifier("baseballCoach") Coach anotherCoach) {
        System.out.println("in constructor " + getClass().getSimpleName());
        this.myCoach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Check coach === another coach, " + (myCoach == anotherCoach);
    }
}
