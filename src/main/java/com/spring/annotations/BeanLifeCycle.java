package com.spring.annotations;

import com.spring.annotations.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {
        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);

        //Coach coach2 = context.getBean("baseball", Coach.class);

        System.out.println(coach.getDailyWorkout());
        //close context
        context.close();
    }
}
