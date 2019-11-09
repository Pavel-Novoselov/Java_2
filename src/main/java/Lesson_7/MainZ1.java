package Lesson_7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MainZ1 {
    public static ArrayList<Method> sortedMethods = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Class test  = ClassForTest1.class;
        ClassForTest1 classForTest1 = new ClassForTest1();

        start(test, classForTest1);


    }

    public static void start(Class test, ClassForTest1 classForTest1) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = test.getDeclaredMethods();
        //сортировака массива методов по приоритету и проверка единственности аннотаций before and after
        Method temp;
        int before=0, after=0;
        for (int i = 0; i < methods.length-1; i++) {
            for (int j = i+1; j < methods.length; j++) {
                if (methods[i].isAnnotationPresent(Test.class)&&methods[j].isAnnotationPresent(Test.class)) {
                    if (methods[i].getAnnotation(Test.class).priority() < methods[j].getAnnotation(Test.class).priority()) {
                        temp = methods[j];
                        methods[j] = methods[i];
                        methods[i] = temp;
                    }
                }
                if (methods[i].isAnnotationPresent(BeforeSuite.class)&&(before==0)&&(i>0)) {
                        before++;
                        temp = methods[0];
                        methods[0] = methods[i];
                        methods[i] = temp;
                } else if (methods[i].isAnnotationPresent(BeforeSuite.class)&&(before>0))
                    {
                    throw new RuntimeException("More than one BeforeSuite method");
                    }
                if (methods[i].isAnnotationPresent(AfterSuite.class)&&(after==0)) {
                    after++;
                    temp = methods[methods.length - 1];
                    methods[methods.length - 1] = methods[i];
                    methods[i] = temp;
                } else if(methods[i].isAnnotationPresent(BeforeSuite.class)&&(after>0))
                {
                    throw new RuntimeException("More than one AfterSuite method");
                }
            }
        }
        //тестирование - вызов всех методов
        for (Method m:
                methods) {
            if(m.isAnnotationPresent(BeforeSuite.class)){
                m.invoke(classForTest1);
            } else if (m.isAnnotationPresent(Test.class)){
                System.out.println(m.invoke(classForTest1, 5, 3));
            } else if (m.isAnnotationPresent(AfterSuite.class)){
                m.invoke(classForTest1);
            }
        }

    }

}
