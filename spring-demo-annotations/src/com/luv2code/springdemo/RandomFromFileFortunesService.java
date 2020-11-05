package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class RandomFromFileFortunesService implements FortuneService{

    @Override
    public String getFortune() {
        File fortuneFile = new File
                ("C:\\Users\\elena\\IdeaProjects\\Spring_udemy\\FortuneFile.txt");
        List<String>fortuneList = new ArrayList<String>();
        String randomFortune="";

        try {
            Scanner scanner = new Scanner(fortuneFile);
            while (scanner.hasNextLine()){
                String fortune = scanner.nextLine();
                fortuneList.add(fortune);
                Random random = new Random();
                int index = random.nextInt(fortuneList.size());

                randomFortune = fortuneList.get(index);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
                return randomFortune;
    }
}
