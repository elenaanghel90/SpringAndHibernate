package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 5 km each day - volleyball!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
