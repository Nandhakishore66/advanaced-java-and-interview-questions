package com.interview.questions;

import java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args){
        int[] arr1 = {2,4,7,8,10,14};
        int[] arr2 = {2,4,7,8,10,14};
        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result);


        //Approach 2
        boolean state = true;
        if(arr1.length==arr2.length){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    state = false;
                }
            }
        }
        else {
            state = false;
            System.out.println(state);
        }

        if(state){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
