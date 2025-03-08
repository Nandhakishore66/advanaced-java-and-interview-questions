package com.interview.questions;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Enter the number of a");
        b = scanner.nextInt();
        System.out.println("Enter the number of b");
        c = scanner.nextInt();
        System.out.println("Enter the number of c");

        if(a>b && a>c){
            System.out.println("A is Greater");
        }
        if(b>a && b>c){
            System.out.println("b is Greater");
        }
        else{
            System.out.println("c is Greater");
        }
    }

}
