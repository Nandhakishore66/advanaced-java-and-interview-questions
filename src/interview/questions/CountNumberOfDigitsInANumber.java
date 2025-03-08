package com.interview.questions;

public class CountNumberOfDigitsInANumber {

    public static void main(String[] args) {
        int num = 265743;
        int count = 0;
        while(num>0) {
            num = num/10;
            count++;
        }
        System.out.println(count);
        //For removing the last digit of the number we have to use division
    }
}
