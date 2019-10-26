package main.java.Lesson_3.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("D:/Dropbox/GeekBrain/Java_2/111/test1.txt"));
        ArrayList<char[]> strings = new ArrayList<>();
        ArrayList<Character> text =new ArrayList<>();

        int countChar=0;
        final int charInPage = 1800;

        long t= System.currentTimeMillis();
//записываем аррэйлист считанные строки
        while(sc.hasNext()){
            char[] temp = sc.nextLine().toCharArray();
            strings.add(temp);
            countChar+=temp.length;
        }
//записываем все строки в ОДИН массив символов с добавлением переноса после каждой строки
        for (char[] cA:
                strings) {
            for (int i = 0; i < cA.length; i++) {
                text.add(cA[i]);
            }
            String s = "\n";
            text.add(s.charAt(0));
        }
//вывод: время и кол-во символов
        System.out.println("время загрузки: "+(System.currentTimeMillis()-t));
        System.out.println("кол-во символов в киге: "+countChar);

        int page=0;
        boolean end=false; //флаг окончания файла

        Scanner sc1 = new Scanner(System.in);
//вывод запрошенной страницы
        do{
            System.out.println("\n Page number? ");
            String str1=sc1.next();
            page=Integer.parseInt(str1);

            long t1 = System.currentTimeMillis();

            for (int i = (page-1)*charInPage; i <(page*charInPage) ; i++) {
                try{
                    System.out.print(text.get(i));
                } catch (IndexOutOfBoundsException e){
                    System.out.println("\n Конец файла!");
                    end=true;
                    break;
                }
            }
            System.out.println("\n время вывода страницы: "+(System.currentTimeMillis()-t1));
            if (end) break;
        } while (true);
    }
}
