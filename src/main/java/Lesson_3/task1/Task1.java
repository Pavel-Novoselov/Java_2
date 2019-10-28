package main.java.Lesson_3.task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
  //      File file = new File("D:/Dropbox/GeekBrain/Java_2/111/test1.txt");
  //      FileInputStream fileInputStream = new FileInputStream("D:/Dropbox/GeekBrain/Java_2/111/test3.txt");
        BufferedInputStream in =  new BufferedInputStream(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/111/test3.txt"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();

//        byte[] arr = new byte[50];
        int x;
 //       while ((x = fileInputStream.read(arr)) != -1) {
 //               System.out.println(new String(arr,0, x));
 //           System.out.println("Количество байт: "+x);
 //           }

        while((x=in.read())!=-1) out.write(x);

        byte[] b = out.toByteArray();
        System.out.println(Arrays.toString(b));
        in.close();
        out.close();
        System.out.println(new String(b,0,b.length));
    }
}
