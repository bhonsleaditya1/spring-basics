package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotations {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        // get bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        FootballCoach coach1 = context.getBean("footballCoach",FootballCoach.class);

        // call method on bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getDailyWorkout());

        //method for daliy fortune
        System.out.println(coach.getDailyFortune());
        System.out.println(coach1.getDailyFortune());

        coach1.valueInjection();

        //close context
        context.close();
    }
}
