package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    public static void main(String[] args) {
        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach",Coach.class);

        Coach betaCoach = context.getBean("myCoach",Coach.class);
        //check if they are same
        boolean result = (coach==betaCoach);

        //result
        System.out.println("If same: "+result);
        System.out.println("Memory location for coach: "+ coach);
        System.out.println("Memory location for betaCoach: "+ betaCoach);

        //close context
        context.close();
    }
}
