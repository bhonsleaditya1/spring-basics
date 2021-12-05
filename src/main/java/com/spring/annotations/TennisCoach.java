package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practise your Backhand";
    }
}
