package com.java.interview.questions;

import java.util.Scanner;

public class FloydTrianglePattern {
    public void floydTriangle() {
        int row;
        int column;
        int rowCount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row count");
        rowCount = input.nextInt();
        for (row=0; row<rowCount; row++){
            for(column=0; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void floydTriangleUsingNumber() {
        int row, column;
        int number = 1;
        int rowCount;
        Scanner input = new Scanner(System.in);
        rowCount = input.nextInt();
        for(row =0; row<rowCount; row++) {
            for(column=0; column<=row; column++){
                System.out.print(number+" ");
                number = number + 1;
            }
            System.out.println();
        }
    }

    public void triangle() {
      //Available in important things My chat

    }
    public static void main(String[] args) {
        FloydTrianglePattern floydTrianglePattern = new FloydTrianglePattern();
        //floydTrianglePattern.floydTriangle();
        floydTrianglePattern.floydTriangleUsingNumber();

    }
}
