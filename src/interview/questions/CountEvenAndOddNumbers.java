package com.interview.questions;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {

        //For extracting the last digit we have to use modulus
        int numbers = 63236387;
        int even = 0;
        int odd = 0;
        while (numbers>0){
            int rem = numbers%10;
            if(rem%2==0){
                even++;
            }else {
                odd++;
            }
            numbers = numbers/10;

        }
        System.out.println(even);
        System.out.println(odd);
    }

}
