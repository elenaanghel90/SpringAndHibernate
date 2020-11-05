package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//if on the component we don't set anything, the default id bean will be "tennisCoach" with lowerCase
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach(){
        System.out.println(">>TennisCoach: inside the default constructor!");
    }

//    //define a setter method for injection
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService){
//        System.out.println(">>TennisCoach: inside the setFortuneService() method!");
//        fortuneService=theFortuneService;
//    }

    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService){
        System.out.println(">>TennisCoach: inside the doSomeCrazyStuff() method!");
        fortuneService=theFortuneService;
    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
