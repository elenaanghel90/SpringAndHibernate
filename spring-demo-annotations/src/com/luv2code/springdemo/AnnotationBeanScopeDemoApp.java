package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theCoach1 = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        boolean result = (theCoach == theCoach1);

        System.out.println("\nPointing to the same object: "+result);
        System.out.println("\nMemory location for theCoach: "+theCoach);
        System.out.println("\nMemory location for theCoach1: "+theCoach1 +" \n");

        context.close();

    }
}
