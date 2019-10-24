package Lesson_1.task4;

import com.sun.javafx.geom.transform.GeneralTransform3D;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        
        SomeClass someClass1 = new SomeClass(1, "Test1");
        SomeClass someClass2 = new SomeClass(2, "Test1");
        SomeClass someClass3 = new SomeClass(3, "Test1");
        SomeClass someClass4 = new SomeClass(4, "Test2");
        SomeClass someClass5 = new SomeClass(5, "Test2");
        SomeClass someClass6 = new SomeClass(6, "Test3");
        SomeClass someClass7 = new SomeClass(7, "Test3");
        SomeClass someClass8 = new SomeClass(8, "Test4");

        ArrayList<SomeClass> list = new ArrayList<SomeClass>();

        list.add(someClass1);
        list.add(someClass2);
        list.add(someClass3);
        list.add(someClass4);
        list.add(someClass5);
        list.add(someClass6);
        list.add(someClass7);
        list.add(someClass8);

        list.forEach(item-> System.out.println(item.getId() + " "+ item.getName()));

        Map<String, ArrayList<Integer>> hashMap = new HashMap<>();

        list.forEach(item->{
            ArrayList<Integer> listInt = new ArrayList<>();
            if (hashMap.containsKey(item.getName())){
                listInt=hashMap.get(item.getName());
                listInt.add(item.getId());
                System.out.println("Добавили: "+listInt);
                hashMap.put(item.getName(), listInt);
            } else
            {
                listInt.add(item.getId());
                hashMap.put(item.getName(), listInt);
                System.out.println("создали: "+listInt);
            }
        });

        for (String str: hashMap.keySet()
             ) {
            System.out.println(str+"="+hashMap.get(str));
        }
    }
}
