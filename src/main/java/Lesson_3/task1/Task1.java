package Lesson_3.task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Dropbox/GeekBrain/Java_2/111/test1.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] arr = new byte[50];

        for (int i = 0; i < arr.length; i++) {
            fileInputStream.read(arr);
        }
        for (byte b:
             arr) {
            System.out.print((char)b);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/Dropbox/GeekBrain/Java_2/111/test1.txt"));
        


    }

}
