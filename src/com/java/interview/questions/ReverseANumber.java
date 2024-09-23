package com.java.interview.questions;

import java.util.Scanner;

public class ReverseANumber {

    int given;
    int reversed;
    public void reverse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        given = input.nextInt();
        while (given!=0) {
            reversed = reversed * 10;
            reversed = reversed + given % 10;
            given = given / 10;
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        ReverseANumber number = new ReverseANumber();
        number.reverse();
    }
}
