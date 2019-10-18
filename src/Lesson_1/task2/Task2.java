package Lesson_1;

public class Task2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        ArrToArrList<Integer> arrToArrList = new ArrToArrList<>(arr);
        arrToArrList.arrayToList();
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}
