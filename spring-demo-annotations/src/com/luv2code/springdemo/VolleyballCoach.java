package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    //define field injection (Reflection)
    @Autowired
    @Qualifier("randomFromFileFortunesService")
    private FortuneService fortuneService;

    //inject the properties values
    @Value("foo.emailAddress")
    private String emailAddress;

    @Value("foo.team")
    private String teamName;

    //set @Qualifier on constructor
    @Autowired
    public VolleyballCoach(@Qualifier("randomFromFileFortunesService") FortuneService fortuneService) {
        System.out.println(">> VolleyballCoach: inside constructor using @autowired and @qualifier");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5 km each day - volleyball!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
