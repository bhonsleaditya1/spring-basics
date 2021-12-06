package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        // get bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        Coach coach1 = context.getBean("tennisCoach",Coach.class);

        //check if they are same
        boolean result = (coach==coach1);

        //result
        System.out.println("If same: "+result);
        System.out.println("Memory location for coach: "+ coach);
        System.out.println("Memory location for betaCoach: "+ coach1);

        //close context
        context.close();
    }
}
