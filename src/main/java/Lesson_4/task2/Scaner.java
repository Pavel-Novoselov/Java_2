package main.java.Lesson_4.task2;

import java.io.*;
import java.util.Scanner;

public class Scaner {
    private volatile int request=0;
    FileInputStream in = null;
    FileOutputStream out = null;

    public synchronized void scanOne(String scanFile, String newFile) throws IOException, InterruptedException {
        request++;
        in = new FileInputStream(scanFile);
        out = new FileOutputStream(newFile);

        while (request>1){
            wait();
        }
        String str;
        int x;
        byte[] arr = new byte[512];
        while ((x=in.read(arr))!=-1){
            out.write(arr);
        }
        request--;
        notifyAll();

    }
}
