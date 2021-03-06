package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        //read Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from the Spring container
        Coach theCoach = context.getBean("volleyballCoach", Coach.class);

        //call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get dailyFortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
