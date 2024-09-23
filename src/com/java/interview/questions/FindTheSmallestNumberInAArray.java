package com.java.interview.questions;

import java.util.Arrays;

public class FindTheSmallestNumberInAArray {
    // 1. Using our own logic 2. using Arrays

    /* Ippo array ku ulla neraya values irukum. so naan oru value ah innoru value kooda
    compare pannanum logic epdina 1st value naan smallest nu eduthukanum then 2 value
    adha vida smallest ah irundha then 2nd value thaan smallest if not adhe 1st value
    thaan smallest idhe maari iruka ella values koodayum compare pannanum*/
    int [] arrays = {3,4,2,8,6,9};
    public void usingOwnLogic() {
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<arrays.length; i++) {
            if(arrays[i] < smallest){
                smallest = arrays[i];
            }
        }
        System.out.println(smallest);
    }

    public void max() {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arrays.length; i++) {
            if(arrays[i] > max){
                max = arrays[i];
            }
        }
        System.out.println(max);
    }

    public void usingArrays() {
        Arrays.sort(arrays); // Sort fun will convert the given array into ascending order
        //Now if we get the 0th position it will print the min value
        System.out.println(arrays[0]);
    }

    public static void main(String[] args) {
        FindTheSmallestNumberInAArray obj = new FindTheSmallestNumberInAArray();
        obj.usingOwnLogic();
        obj.usingArrays();
        obj.max();
    }
}
