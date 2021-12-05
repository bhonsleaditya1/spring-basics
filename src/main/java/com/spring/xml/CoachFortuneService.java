package com.spring.xml;

public class CoachFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
