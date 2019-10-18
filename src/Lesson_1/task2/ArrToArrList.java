package Lesson_1;

import java.util.ArrayList;

public class ArrToArrList<T> {
    private T[] array;
    private ArrayList<T> arrayList;

    public ArrToArrList(T[] array) {
        this.array = array;
    }

    public ArrayList<T> arrayToList(){
        arrayList = new ArrayList<T>();
        for (T a: array
             ) {
            arrayList.add(a);
        }
        return arrayList;
    }
}
