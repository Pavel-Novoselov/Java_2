package Lesson_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        int a = 2;
//        int b = 10;
//        int c = 1 >> a++ + ++b - --a - b << 1;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        Object obj = new int[][]{{1,2,3}, {4,5,6}};
//
//        int[][] mass = (int[][]) obj;
//
//        for (int []currentMass: mass) {
//            for (int res: currentMass) {
//                System.out.println(res);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        int a;
        try {
            a = Integer.valueOf(res);
            System.out.println("Значит число");
        } catch (ClassCastException e) {
            System.out.println("Значит не число");
            e.printStackTrace();
        }

    }
}


//1 какой результат ?


//
//


















//        2 какой резульат?
//
//class Test123 {
//    List<Integer> list;
//
//    Test123() {
//        list = new ArrayList<>();
//        someTest(list);
//    }
//
//    void someTest(List<Integer> al) {
//        al.add(0);
//        al = null;
//    }
//
//    public static void main(String[] args) {
//        Test123 test = new Test123();
//        System.out.println(test.list.size());
//    }
//}
//












//
//3 Есть таблица employees нужно написать запрос чтобы получить все записи из
// таблицы в колонке last_name,
// значения которые начинаются с JDBC
//
//















//
//        4 Напишите 1 запрос дления сразу двух колонок в таблице employees (столбцы name, surname)ля обнов