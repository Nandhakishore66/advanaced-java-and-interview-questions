package com.java.interview.questions;

import java.util.HashSet;

public class DuplicateValuesInArray {

    public void usingSomeLogic(){
        int[] values = {10, 20, 40, 10, 80, 90, 40};
        for(int i=0; i<values.length; i++) {
            for(int j=i+1; j<values.length; j++){
                if(values[i] == values[j]){
                    System.out.println("The duplicated value is "+values[i]);
                }
            }
        }
    }

    public void usingHashSet() {
        HashSet hs = new HashSet();
        System.out.println(hs.add("java"));
        System.out.println(hs.add("py"));
        System.out.println(hs.add("java"));

    }

    public static void main(String[] args) {
        DuplicateValuesInArray dup = new DuplicateValuesInArray();
        //dup.usingSomeLogic();
        dup.usingHashSet();
    }
}
