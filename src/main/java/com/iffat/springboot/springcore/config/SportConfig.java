package com.iffat.springboot.springcore.config;

import com.iffat.springboot.springcore.common.Coach;
import com.iffat.springboot.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
