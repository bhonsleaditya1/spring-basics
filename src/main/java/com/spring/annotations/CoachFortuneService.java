package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class CoachFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!!";
    }
}
