package com.interview.questions;

public class MissingNumberInArray {
    public static void main(String[] args){
        //1. Array should not have duplicates
        //2.Array no need to be in sorted order
        //3. Array should be in range
        int[] arr = {1,2,4,5};
        int sum1=0;
        for(int i=0; i<arr.length; i++){
            sum1 = sum1+arr[i];
        }
        System.out.println(sum1);
        int sum2 =0;
        for(int i=1; i<=5; i++){
            sum2 = sum2+i;
        }
        System.out.println(sum2);
        int res = sum2 - sum1;
        System.out.println("Missing number"+res);
    }
}
