package com.search.sort;

import java.util.Scanner;

public class FibinocciSeries {
    public static void main(String[] args){
        int num1=0;
        int num2=1;
        int nextNum;
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length");
        length = input.nextInt();
        for(int i=0; i<length; i++){
            System.out.println(num1);
            nextNum=num1+num2;
            num1=num2;
            num2=nextNum;
        }
    }
}
