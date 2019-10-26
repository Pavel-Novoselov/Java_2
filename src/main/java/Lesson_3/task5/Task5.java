package main.java.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/111/test2.txt"));

       ArrayList<String> strings = new ArrayList<>();

        while (sc.hasNext()){
            strings.add(sc.nextLine());
        }

        for (int i = strings.size()-1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}
