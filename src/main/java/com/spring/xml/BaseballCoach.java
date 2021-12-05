package com.spring.xml;

import org.springframework.beans.factory.DisposableBean;

public class BaseballCoach implements Coach, DisposableBean {

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

    // add an init method
    public void startUp(){
        System.out.println("BaseBall Coach: inside method startUp");
    }

    // add an destroy method
    public void cleanUp(){
        System.out.println("BaseBall Coach: inside method cleanUp");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Baseball: inside method destroy");
    }
}
