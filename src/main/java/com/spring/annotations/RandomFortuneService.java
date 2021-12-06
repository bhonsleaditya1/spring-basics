package com.spring.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    //create array of strings
    private String[] data = {
            "Beware of wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is  the reward"
    };

    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        //pick random string from array
        int index = random.nextInt(data.length);
        return data[index];
    }
}
