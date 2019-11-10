package main.java.Lesson_3.task4;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        ClassJavaDeveloper javaDeveloper1 = new ClassJavaDeveloper(1, "Вася", 55);
        ClassJavaDeveloper javaDeveloper2 = new ClassJavaDeveloper(2, "Петя", 75);

        Socket socket = new Socket("localhost", 8287);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        oos.writeObject(javaDeveloper1);
        javaDeveloper1.info();
        System.out.println("Programmer "+javaDeveloper1.getName()+" serialized and sended to Server");

        oos.writeObject(javaDeveloper2);
        javaDeveloper2.info();
        System.out.println("Programmer "+javaDeveloper2.getName()+" serialized and sended to Server");

    }
}
