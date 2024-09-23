package com.java.interview.questions;

public class ReverseAWord {
    public void reverseAWordInASentence() {
        String sentence = "My name is virat";
        String[] split = sentence.split(" ");
        System.out.println(split.length);
        for (int i=split.length-1; i>=0; i--){
            System.out.print(split[i]+" ");
        }
    }

    public static void main(String[] args) {
        ReverseAWord reverseAWord = new ReverseAWord();
        reverseAWord.reverseAWordInASentence();
    }
}
