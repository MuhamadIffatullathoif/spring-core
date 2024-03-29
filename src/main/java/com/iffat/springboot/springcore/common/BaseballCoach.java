package com.iffat.springboot.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("in constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball coach implement Coach service in dailyworkout";
    }
}
