package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotations {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        // get bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        Coach coach1 = context.getBean("footballCoach",Coach.class);
        // call method on bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getDailyWorkout());
        //close context
        context.close();
    }
}
