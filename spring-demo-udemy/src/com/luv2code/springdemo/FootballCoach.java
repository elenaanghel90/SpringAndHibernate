package com.luv2code.springdemo;


public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Pass the ball for 5 minutes";
    }

    @Override
    public String startTheTraining() {
        return "The training started at 8 o'clock for the football coach";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
