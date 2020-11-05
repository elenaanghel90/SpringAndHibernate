package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//if on the component we don't set anything, the default id bean will be "tennisCoach" with lowerCase
public class TennisCoach implements Coach {

    //define field injection (Reflection)
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach() {
        System.out.println(">>TennisCoach: inside the default constructor!");
    }

//    //define a setter method for injection
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService){
//        System.out.println(">>TennisCoach: inside the setFortuneService() method!");
//        fortuneService=theFortuneService;
//    }

//    //define method injection
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService){
//        System.out.println(">>TennisCoach: inside the doSomeCrazyStuff() method!");
//        fortuneService=theFortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

    //set @Qualifier on constructor
    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
