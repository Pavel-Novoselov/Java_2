package main.java.Lesson_4.task2;

import java.io.IOException;

public class MFU {
    public static void main(String[] args){

        //включили принтер
        Print print = new Print();
        //включили сканер
        Scaner scaner = new Scaner();

        //сканируем 1 файл (из одного файла читаем, в другой  - пишем)
        new Thread(()->{
            try {
                scaner.scanOne("D:/Dropbox/GeekBrain/Java_2/111/test2.txt", "D:/Dropbox/GeekBrain/Java_2/111/test4.txt");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //отправили на печать 3 файла
            new Thread(()->{
                try {
                    print.printOne("D:/Dropbox/GeekBrain/Java_2/111/test4.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(()->{
                try {
                    print.printOne("D:/Dropbox/GeekBrain/Java_2/111/test5.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(()->{
                try {
                    print.printOne("D:/Dropbox/GeekBrain/Java_2/111/test6.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();


        //сканируем еще1 файл (из одного файла читаем, в другой  - пишем)
        new Thread(()->{
            try {
                scaner.scanOne("D:/Dropbox/GeekBrain/Java_2/111/test3.txt", "D:/Dropbox/GeekBrain/Java_2/111/test4.txt");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
//печать
        new Thread(()->{
            try {
                print.printOne("D:/Dropbox/GeekBrain/Java_2/111/test4.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();




    }
}

