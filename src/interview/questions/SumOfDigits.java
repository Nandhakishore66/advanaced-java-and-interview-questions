package com.interview.questions;

public class SumOfDigits {

    public static void main(String[] args) {

        //modulus will take the last number
        //division will remove the last number
        int numbers = 756328;
        int sum=0;
        while(numbers>0){
            sum = sum+numbers%10;
            numbers=numbers/10;
        }
        System.out.println(sum);
    }
}
