package models;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public static int roll(){
        int randomNum;
        return randomNum = ThreadLocalRandom.current().nextInt(0, 6);
    }
}
