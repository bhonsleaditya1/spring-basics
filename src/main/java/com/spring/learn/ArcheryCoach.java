package com.spring.learn;

public class ArcheryCoach implements Coach{

    FortuneService fortuneService;
    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("ArcheryCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("ArcheryCoach: inside setter method - setTeam");
        this.team = team;
    }

    // create no-arg constructor
    public ArcheryCoach(){
        System.out.println("ArcheryCoach: inside no-arg constructor");
    }

    // setter method for dependency injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("ArcheryCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot 15 arrows per min Stat!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
