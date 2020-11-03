package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VolleyballCoach implements Coach,DisposableBean {

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define constructor for dependency injection
    public VolleyballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public VolleyballCoach(){}

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String startTheTraining() {
        return "The training started at 8 o'clock for the volleyball coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add an init method
    public void doMyStartupStuff() {
        System.out.println("VolleyballCoach: inside method doMyStartupStuff");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("VolleyballCoach: inside method destroy for prototype example!");
    }

//    //add destroy method for Singleton scope
//    public void doMyCleanupStuff() {
//        System.out.println("VolleyballCoach: inside method doMyCleanupStuff");
//    }
}
