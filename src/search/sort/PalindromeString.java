package com.search.sort;

public class PalindromeString {
    public static void main(String[] args){
        String original = "malayalam";
        String reverse = "";
        for(int i=original.length()-1; i>=0; i--){
            reverse=reverse+original.charAt(i);
        }
        if(reverse.equalsIgnoreCase(original)){
            System.out.println("String palindrome");
        }else{
            System.out.println("Not a String palindrome");
        }
    }
}
