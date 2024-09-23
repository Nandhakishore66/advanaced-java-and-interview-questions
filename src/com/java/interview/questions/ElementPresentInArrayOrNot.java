package com.java.interview.questions;

import java.util.Scanner;

public class ElementPresentInArrayOrNot {
    int ele;
    public void elementPresentInArray() {
        int[] values = {6,2,3,9,5,1,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        ele = scanner.nextInt();
        for (int number : values){
            if(number==ele){
                System.out.println("Entered number is present");
                break;
            }
        }
//        for (int i=0; i<values.length; i++){
//            if (values[i]==ele){
//                System.out.println("Entered number is present");
//                //break;
//            }
//            else {
//                System.out.println("Entered number is not present inside the array");
//            }
//        }
    }
    public static void main(String[] args) {
        ElementPresentInArrayOrNot isPresent = new ElementPresentInArrayOrNot();
        isPresent.elementPresentInArray();
    }
}
