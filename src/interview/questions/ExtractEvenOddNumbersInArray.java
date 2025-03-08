package com.interview.questions;

public class ExtractEvenOddNumbersInArray {
    public static void main(String[] args) {
        int[] val = {4, 7, 9, 2, 3, 6, 1};
        for (int oop : val) {
           if(oop%2==0){
               System.out.println("Even values are"+oop);
           } else {
               System.out.println("odd values are"+ oop);
           }
        }
    }
}
