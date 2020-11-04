package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
//if on the component we don't set anything, the default id bean will be "tennisCoach" with lowerCase
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
