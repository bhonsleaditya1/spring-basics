package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {
        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/beanLifeCycle.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach",Coach.class);

        Coach coach2 = context.getBean("baseball",Coach.class);

        System.out.println(coach.getDailyWorkout());
        //close context
        context.close();
    }
}
