package com.search.sort;

public class PalindromeNumber {
    public static void main(String[] args){
        int num=212;
        int original=num;
        int temp;
        int check=0;
        while (num>0){
            temp = num%10;
            check=(check*10)+temp;
            num=num/10;
        }
        if(original==check){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
