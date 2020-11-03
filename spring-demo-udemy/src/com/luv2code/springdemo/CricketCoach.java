package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    //add new fields for emailAddress and team
    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    //create no-arg constructor
    public CricketCoach() {
        System.out.println("Cricket coach: inside no-arg constructor");
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach: inside setter method -setTeam");
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket coach: inside setter method -setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    //our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach: inside setter method -setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String startTheTraining() {
        return "the training start a 5 o'clock for cricket coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
