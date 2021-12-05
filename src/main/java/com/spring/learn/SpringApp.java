package com.spring.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("track",Coach.class);

        //call methods on bean
        System.out.println(coach.getDailyWorkout());

        // method of Fortune
        System.out.println(coach.getDailyFortune());

        //close the context
        context.close();
    }
}
