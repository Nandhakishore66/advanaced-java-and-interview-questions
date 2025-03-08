package com.search.sort;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String str1= "cat";
        String str2 = "act";
        if(str1.length()!=str2.length()){
            System.out.println("It is not a anagram");
        }else{
            char[] dup = str1.toCharArray();
            char[] dup2 = str2.toCharArray();

            Arrays.sort(dup);
            Arrays.sort(dup2);
            if(Arrays.equals(dup,dup2)){
                System.out.println("It is a anagram");
            }else {
                System.out.println("It is a not anagram");
            }
        }
    }
}
