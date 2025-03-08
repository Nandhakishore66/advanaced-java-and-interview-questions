package com.search.sort;

public class FindTargetValueInArray {
    public static void main(String[] args){
        int[] arr = {6,10,7,4,8};
        int target = 11;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Target value is "+ arr[i]);
                    System.out.println("Target value is "+ arr[j]);
                    break;
                }
            }
        }
    }
}
