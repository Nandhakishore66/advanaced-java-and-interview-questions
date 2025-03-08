package com.search.sort;

public class PrimeNumber {
    public static void main(String[] args){
        //The number which is divided by 1 and by itself is a prime
        int num=17;
        int i=2;
        boolean prime=true;
        while (i<num){
            if(num%i==0){
                prime=false;
                System.out.println("Not a prime");
                break;
            }else {
                i++;
            }
        }
        if(prime){
            System.out.println("It is prime");
        }
    }
}
