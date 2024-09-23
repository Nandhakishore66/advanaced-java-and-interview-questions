package com.java.interview.questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingInJava {

    public void readingTheFile() throws IOException {
        String fileLocation = "UsingBufferedWriter.txt";
        FileReader fileReader = new FileReader(fileLocation);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //By using read line it will take only the single if we want to take all line use loop
        //String readingLine = bufferedReader.readLine();
        //System.out.println(readingLine);
        String readingLine;
        while ((readingLine = bufferedReader.readLine())!=null){
            System.out.println(readingLine);
        }
    }

    public static void main(String[] args) throws IOException {
        FileReadingInJava obj = new FileReadingInJava();
        obj.readingTheFile();
    }
}
