package Lesson_1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //String
        String[] arrStr = {"First", "Second", "Third", "Fourth"};

        System.out.println("Array:");
        for (String s: arrStr) {
            System.out.println(s);
        }

        ChangeElements<String> chStr1and3 = new ChangeElements<>(1,3,arrStr);
        arrStr = chStr1and3.change();

        System.out.println("Changed array:");
        for (String s: arrStr) {
            System.out.println(s);
        }
        //int
        Integer[] arrInt = {1,2,3,4,5,6,7,8,9};

        System.out.println("Array");
        for (Integer i: arrInt) {
            System.out.print(i+" ");
        }
        System.out.println();

        ChangeElements<Integer> chInt3to7 = new ChangeElements<>(3,7,arrInt);
        arrInt = chInt3to7.change();

        System.out.println("Changed array");
        for (Integer i: arrInt) {
            System.out.print(i+" ");
        }
        System.out.println();

//HashMAp's array
        HashMap<String, Integer> hm3 = new HashMap<>();
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm1.put("first", 11);
        hm1.put("second",12);
        hm1.put("third", 13);
        hm2.put("first", 21);
        hm2.put("second", 22);
        hm2.put("third", 23);
        hm3.put("first", 31);
        hm3.put("second", 32);
        hm3.put("third", 33);
        HashMap[] arrHM = new HashMap[]{hm1,hm2,hm3};
        System.out.println("Array");
        for (HashMap hm:arrHM
        ) {
            System.out.println(hm);
        }
        ChangeElements<HashMap> chHM2to3 = new ChangeElements<HashMap>(2,3, arrHM);
        chHM2to3.change();
        System.out.println("Changed array");
        for (HashMap hm:arrHM
             ) {
            System.out.println(hm);
        }
        //Oblects
        // Object o1 = new Object()
    }
}
