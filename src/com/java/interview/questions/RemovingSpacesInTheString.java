package com.java.interview.questions;

public class RemovingSpacesInTheString {
    public void removeSpaces(){
            String name = " I love birds ";
            System.out.println(name.trim());
            System.out.println(name.strip());//Strip functions avail from java11
            System.out.println(name.stripLeading());
            System.out.println(name.stripTrailing());
    }
    public static void main(String[] args) {
        RemovingSpacesInTheString obj = new RemovingSpacesInTheString();
        obj.removeSpaces();
    }
}
