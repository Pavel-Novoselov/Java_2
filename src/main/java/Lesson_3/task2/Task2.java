package main.java.Lesson_3.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<InputStream> ali = new ArrayList<>();
        ali.add(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/16102019/123/test1.txt"));
        ali.add(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/16102019/123/test2.txt"));
        ali.add(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/16102019/123/test3.txt"));
        ali.add(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/16102019/123/test9.txt"));
        ali.add(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/16102019/123/test123.txt"));

        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ali));
        byte[] arr = new byte[512];
        int x;
        while ((x = in.read(arr)) != -1) {
            System.out.println(new String(arr,0,x));
        }
        in.close();
    }
}
