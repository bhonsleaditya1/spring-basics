package com.spring.learn;

public class CoachFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
