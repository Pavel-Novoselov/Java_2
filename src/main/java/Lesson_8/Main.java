package Lesson_8;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers = 20;
        int[] arr = new int[numbers];
        Lesnik lesnik = new Lesnik("D:\\Dropbox\\GeekBrain\\Java_2\\123\\lesnik.txt", numbers);
        try {
            arr=lesnik.counter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.println("Цифра "+i+" встречается "+arr[i]+" раз");
            }
        }

    }
}

