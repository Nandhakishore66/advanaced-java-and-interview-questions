package com.interview.questions;

public class FindSumOfElementsInArray {
    public static void main(String[] args){
        int[] val ={6,4,7,8,2};
        int sum = 0;
        for(int values: val){
            sum=sum+values;
        }
        System.out.println(sum);

//2nd way
        int[] val1={6,7,3,2};
        int sum1=0;
        for(int i=0; i<val1.length; i++){
            sum1=sum1+val1[i];
        }
        System.out.println(sum1);
    }
}
