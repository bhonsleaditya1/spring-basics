package com.spring.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    // constructor injection
    @Autowired
    //
    public TennisCoach(@Qualifier("coachFortuneService") FortuneService fortuneService){
        System.out.println("TennisCoach: using Constructor annotation");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your Backhand";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    // add an init method
    public void startUp(){
        System.out.println("Tennis Coach: inside method startUp");
    }

    // add an destroy method
    public void cleanUp(){
        System.out.println("Tennis Coach: inside method cleanUp");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Tennis: inside method destroy");
    }
}
