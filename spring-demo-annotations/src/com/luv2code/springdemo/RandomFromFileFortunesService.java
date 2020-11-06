package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class RandomFromFileFortunesService implements FortuneService {

    List<String> fortuneList = new ArrayList<String>();

    @Override
    public String getFortune() {
        String randomFortune = getRandomFortune();
        return randomFortune;
    }

    private String getRandomFortune() {
        String randomFortune;
        Random random = new Random();
        int index = random.nextInt(fortuneList.size());

        randomFortune = fortuneList.get(index);
        System.out.println("Display the random fortune!");
        return randomFortune;
    }

    @PostConstruct
    private void readTheFile() {
        File fortuneFile = new File
                ("C:\\Users\\elena\\IdeaProjects\\Spring_udemy\\FortuneFile.txt");
        System.out.println("The file was read!");

        try {
            Scanner scanner = new Scanner(fortuneFile);
            while (scanner.hasNextLine()) {
                String fortune = scanner.nextLine();
                fortuneList.add(fortune);
            }
            System.out.println("Each line of the file were read !");
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("The file was not found!", e);
//            e.printStackTrace();
        }
    }
}
