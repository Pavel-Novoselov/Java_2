package Lesson_1.task2;

import java.util.ArrayList;

public class ArrToArrList<T> {
    private T[] array;
    private ArrayList<T> arrayList;
//конструктор по умолчанию
    public ArrToArrList() {
    }
//конструктор с массивом
    public ArrToArrList(T[] array) {
        this.array = array;
    }
//метод преобразования без параметров
    public ArrayList<T> arrayToList(){
        arrayList = new ArrayList<T>();
        for (T a: array
             ) {
            arrayList.add(a);
        }
        return arrayList;
    }
    //метод преобразования с передачей массива в качестве параметра
    public ArrayList<T> arrayToList(T[] arr){
        arrayList = new ArrayList<T>();
        for (T a: arr
        ) {
            arrayList.add(a);
        }
        return arrayList;
    }

    public void info(){
        for (T t:
             arrayList) {
            System.out.println(t);
        }
    }
}
