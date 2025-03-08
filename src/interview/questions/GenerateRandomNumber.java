package com.interview.questions;

import java.util.Random;

public class GenerateRandomNumber {

    public static void main(String[] args){
        Random random = new Random();
        int ran = random.nextInt(10);//print from 0 to 9
        //Max value is 1000. It will print between 0 to 999
        System.out.println(ran);
    }
}
