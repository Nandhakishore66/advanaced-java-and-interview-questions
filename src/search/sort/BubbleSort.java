package com.search.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubb = {4, 2, 1, 5, 3};
//            2 4 1 5 3
//            2 1 4 5 3
//            2 1 4 5 3
//            2 1 4 3 5 --> 1st bubble as 5

//        2 1 4 3 5
//        1 2 4 3 5
//        1 2 4 3 5
//        1 2 3 4 5 ---> 2nd bubble as 4
        System.out.println("Before sorting"+ Arrays.toString(bubb));
        int n = bubb.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){

                if(bubb[j]>bubb[j+1]) {
                    int temp = bubb[j];
                    bubb[j] = bubb[j+1];
                    bubb[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting"+ Arrays.toString(bubb));
    }
}
