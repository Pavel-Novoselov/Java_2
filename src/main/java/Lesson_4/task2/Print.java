package main.java.Lesson_4.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Print{
    volatile int request = 0;
    Scanner sc;

    public synchronized void printOne(String file) throws IOException {
         {
            request++;
            Scanner sc = new Scanner(new FileReader(file));
            while (request>1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            request--;
            System.out.println("--------------");
            notifyAll();
        }
    }
}
