package Lesson_1.task1;

public class ChangeElements<T> {
    private T[] array;
    private int e1;
    private int e2;

    public ChangeElements(int e1, int e2, T... array) {
        this.array = array;
        this.e1 = e1;
        this.e2 = e2;
    }

    public T[] change (){

        T temp = array[e1-1];
        array[e1-1] = array[e2-1];
        array[e2-1] = temp;

        return array;
    }
}
