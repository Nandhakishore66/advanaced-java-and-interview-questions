package com.java.interview.questions;

public class FindTheLengthOfTheSring {
    public static void main(String[] args) {
        //With using length fun
        String name = "Nandhakishore";
        System.out.println(name.length());
        //Without using length function
        char[] charArray = name.toCharArray();
        int length = 0;
        for(char c:charArray){
            length++;
        }
        System.out.println(length);
    }
}
