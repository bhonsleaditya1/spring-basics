package com.spring.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDependency {
    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrive bean from spring container
        ArcheryCoach coach = context.getBean("archery",ArcheryCoach.class);

        //call methods on bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // methods for literal values
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        //close context
        context.close();
    }
}
