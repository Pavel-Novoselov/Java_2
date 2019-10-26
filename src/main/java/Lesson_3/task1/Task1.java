package main.java.Lesson_3.task1;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
  //      File file = new File("D:/Dropbox/GeekBrain/Java_2/111/test1.txt");
        FileInputStream fileInputStream = new FileInputStream("D:/Dropbox/GeekBrain/Java_2/111/test3.txt");

        byte[] arr = new byte[50];
        int x;
        while ((x = fileInputStream.read(arr)) != -1) {
                System.out.println(new String(arr,0, x));
            System.out.println("Количество байт: "+x);
            }
    }

}
