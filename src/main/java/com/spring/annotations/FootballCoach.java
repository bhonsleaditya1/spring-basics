package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practise Cycle Kick";
    }
}
