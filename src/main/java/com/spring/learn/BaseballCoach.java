package com.spring.learn;

public class BaseballCoach implements Coach {

    // define a private field for dependency injection
    private FortuneService fortuneService;

    // define constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }


    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practise";
    }

    @Override
    public String getDailyFortune() {
        // use fortuneService to get fortune
        return fortuneService.getFortune();
    }
}
