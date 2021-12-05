package com.spring.xml;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){}

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it:"+fortuneService.getFortune();
    }

    // add an init method
    public void startUp(){
        System.out.println("Track Coach: inside method startUp");
    }

    // add an destroy method
    public void cleanUp(){
        System.out.println("Track Coach: inside method cleanUp");
    }
}
