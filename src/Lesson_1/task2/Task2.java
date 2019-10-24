package Lesson_1.task2;

import Lesson_1.task3.Apple;
import Lesson_1.task3.Orange;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Integer
        Integer[] arr = {1,2,3,4,5};
        ArrayList<Integer> arrLI = new ArrayList<>();

        ArrToArrList<Integer> arrToArrList = new ArrToArrList<>(arr);
        arrLI = arrToArrList.arrayToList();

        System.out.println("Array:");
        for (int a:
             arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("ArrayList:");
        for (int a:
             arrLI) {
            System.out.print(a+" ");
        }
        System.out.println();
        //String
        String[] arrS = {"first", "second", "third"};
        ArrayList<String> arrLS = new ArrayList<>();

        ArrToArrList<String> arrListStr = new ArrToArrList<>(arrS);
        arrLS = arrListStr.arrayToList();

        System.out.println("Array:");
        for (String s:
             arrS) {
            System.out.println(s);
        }
        System.out.println("ArrayList:");
        for (String s:
             arrLS) {
            System.out.println(s);
        }
        //object Apple
        Apple[] arrAppel = new Apple[] {new Apple(), new Apple()};
        ArrayList<Apple> arrLA = new ArrayList<>();

        ArrToArrList<Apple> arrListAppel = new ArrToArrList<>();
        arrLA = arrListAppel.arrayToList(arrAppel);

        System.out.println("Array:");
        for (Apple a:
                arrAppel) {
            System.out.println(a.getName().toString());
        }
        System.out.println("ArrayList:");
        for (Apple a:
                arrLA) {
            System.out.println(a.getName());
        }

    }
}
