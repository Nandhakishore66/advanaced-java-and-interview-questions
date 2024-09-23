package com.java.interview.questions;

public class ReplaceVowelsWithSpecialWithSpecialCharacter {

    public void example() {
        String name = "I miss mahi";
        String name1 = name.toLowerCase();
        System.out.println(name1);
        char[] charArray = name1.toCharArray();
        for (int i=0; i<charArray.length; i++){
            if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||
                    charArray[i]=='u'){
                charArray[i]= '*';
            }
        }
        System.out.println(charArray);
        //Another way
//If we use $ we need to use backward slash in front as it is a important component in regex..
        String afterReplacement = name.replaceAll("[AEIOUaeiou]", "\\$");
        System.out.println(afterReplacement);
    }

    public void numberOfVowles(){
        String name = "I miss virat in T20s";
        String name1 = name.toLowerCase();
        System.out.println(name1);
        char[] charArray = name1.toCharArray();
        int num = 0;
        for (int i=0; i<charArray.length; i++){
            if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||
                    charArray[i]=='u'){
                num = num+1;
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        ReplaceVowelsWithSpecialWithSpecialCharacter obj = new ReplaceVowelsWithSpecialWithSpecialCharacter();
        //obj.example();
        obj.numberOfVowles();
    }
}
