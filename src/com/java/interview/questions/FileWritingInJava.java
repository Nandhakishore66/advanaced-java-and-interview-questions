package com.java.interview.questions;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritingInJava {

    public void usingFileWriter() throws IOException {
        /*If I give something like //c or //d it will create the file inside that
        particular location now it will create the file inside this project*/
        String fileLocation = "usingFileWriter.txt";
        String content = "Time to lead";

        FileWriter fileWriter = new FileWriter(fileLocation);
        fileWriter.write(content);
        fileWriter.close();
    }

    public void usingBufferedWriter() throws IOException {
        String fileLocation = "UsingBufferedWriter.txt";
        String content = "Do it anyway";
        FileWriter fileWriter = new FileWriter(fileLocation);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.close();
    }

    public void usingFileOutputStream() throws IOException {
        String fileLocation = "UsingFileOutputStream.txt";
        String content = "Keep on grind even if you don't have any results";
        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        byte[] con = content.getBytes();
        outputStream.write(con);
        outputStream.close();
    }

    public void usingPath() throws IOException {
        String fileLocation = "UsingPath.txt";
        String content = "Don't give up";
        Path path = Paths.get(fileLocation);
        Files.write(path, content.getBytes());
    }


    public static void main(String[] args) throws IOException {
        FileWritingInJava obj = new FileWritingInJava();
        //obj.usingFileWriter();
        //obj.usingBufferedWriter();
        //obj.usingFileOutputStream();
        obj.usingPath();
    }
}
