package com.java.interview.questions;

public class Recursion {
    //A function which is called by itself
    public static int fact(int n){
        if(n==0){
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(fact(n));
    }
}
