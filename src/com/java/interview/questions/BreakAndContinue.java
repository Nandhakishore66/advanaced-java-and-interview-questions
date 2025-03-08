package com.java.interview.questions;

public class BreakAndContinue {
    /*
    1. Continue will skip the remaining statement for the current iteration and go for the
    next iteration.
    2. Break will came out of the loop
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if(i>5){
               break;
            }
            System.out.println("value is"+" " +i);
        }

        for (int i = 1; i <= 10; i++) {
            if(i>5){
                continue;
            }
            System.out.println("value is"+" " +i);
        }
    }
}
