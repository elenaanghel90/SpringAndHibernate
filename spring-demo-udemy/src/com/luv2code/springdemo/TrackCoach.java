package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String startTheTraining() {
        return "The training started at 8 o'clock for the track coach";
    }

    @Override
    public String getDailyFortune() {
        return " Just do it: " + fortuneService.getFortune();
    }

    //add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

//    //add destroy method
//    public  void doMyCleanupStuff(){
//        System.out.println("TrackCoach: inside method doMyCleanupStuff");
//    }

    // add a destroy method for prototype example
    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside method destroy for prototype example");
    }
}
