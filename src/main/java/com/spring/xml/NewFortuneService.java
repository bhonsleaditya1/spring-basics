package com.spring.xml;


public class NewFortuneService implements FortuneService{

    private String[] fortunes  = {
            "This is your Day!!",
            "Achieve your goals today",
            "Go For It!! no goal is big"
    };

    @Override
    public String getFortune() {
        int val = (int) Math.floor(Math.random()*3);
        return fortunes[val];
    }
}
