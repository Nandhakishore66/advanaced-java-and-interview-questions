package com.search.sort;

public class CountOccurances {
    public static void main(String[] args) {
        String sen = "This is the sentence";
        int totalCount = sen.length();
        System.out.println(totalCount);
        int aftCount = sen.replace("e", "").length();
        int c = totalCount-aftCount;
        System.out.println(c);
    }
}
