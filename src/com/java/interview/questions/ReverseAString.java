package com.java.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseAString {

    //----------Using String buffer-------------
    public void reverseAStringUsingStringBuffer() {
        StringBuffer buffer = new StringBuffer("naveen");
        System.out.println("Before reverse " + buffer);
        System.out.println("After reverse " + buffer.reverse());
    }
    //-----------Using own logic--------------
    public void reverseAStringUsingOwnLogic() {
        String name = "naveen";
        char[] characterArray = name.toCharArray();
        //String reversed = "";
        for (int i=characterArray.length-1; i>=0; i--) {
            System.out.print(characterArray[i]);
            //reversed = reversed + characterArray[i];
            //Either we can declare variable and use it or we can directly print
        }
        //System.out.println(reversed);
    }

    public void reverseAStringUsingCollections() {
        String name = "virat";
        char[] characterArray = name.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (Character list1 : characterArray) {
            list.add(list1);
        }
        Collections.reverse(list);
        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

    }
    public static void main(String[] args) {
        ReverseAString reverse = new ReverseAString();
        //reverse.reverseAStringUsingStringBuffer();
        //reverse.reverseAStringUsingOwnLogic();
        reverse.reverseAStringUsingCollections();
    }
}
