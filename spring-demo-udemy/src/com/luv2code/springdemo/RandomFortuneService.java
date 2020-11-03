package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    @Override
    public String getFortune() {
            String[] fortuneArray = {"Today you won the silver trophy!",
                    "Today you won the gold trophy!",
                    "Today you won the platinum trophy!"};

            Random random = new Random();
            int index = random.nextInt(fortuneArray.length);
            String chosenFortune = fortuneArray[index];
            return chosenFortune;
    }
}
