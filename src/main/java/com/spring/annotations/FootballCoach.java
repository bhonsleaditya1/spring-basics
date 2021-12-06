package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FootballCoach implements Coach{

    // Field Injection using Reflection
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;


    // default constructor
    public FootballCoach(){
        System.out.println(">> FootBall Coach: inside default constructor");
    }

    // add an init method
    @PostConstruct
    public void startUp(){
        System.out.println("FootBall Coach: inside method startUp");
    }

    // add an destroy method
    @PreDestroy
    public void cleanUp(){
        System.out.println("FootBall Coach: inside method cleanUp");
    }

    //setter method Injection
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> FootBall Coach: inside setter method");
        this.fortuneService = fortuneService;
    }*/

    // method injection
    /*@Autowired
    public void FortuneService(FortuneService fortuneService) {
        System.out.println(">> FootBall Coach: inside Fortune Service method");
        this.fortuneService = fortuneService;
    }*/

    public void valueInjection(){
        System.out.println("Team from .property: "+team);
        System.out.println("email from .property: "+emailAddress);
    }


    @Override
    public String getDailyWorkout() {
        return "Practise Cycle Kick";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
