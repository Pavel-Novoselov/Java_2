package main.java.Lesson_3.task4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(8287);
        Socket socket = null;

        System.out.println("Server started");
        while(true){
            socket=server.accept();
            System.out.println("Client connected");
            break;
        }

        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/Dropbox/GeekBrain/Java_2/111/test2.txt"));
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        ClassJavaDeveloper newJavaProgrammer1 = (ClassJavaDeveloper) ois.readObject();
        newJavaProgrammer1.info();
        ClassJavaDeveloper newJavaProgrammer2 = (ClassJavaDeveloper) ois.readObject();
        newJavaProgrammer2.info();
    }
}
