package Lesson_7;

import Lesson_7.AnonPresent.MyAnon;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.io.*;

public class MainRef {
    public static void main(String[] args) throws Exception {

//        File file = new File("C:/123");
//        String[] str = file.list();
//
//        for (String o: str) {
//            String[] mass = o.split("\\.");
//            if(!mass[1].equalsIgnoreCase("class")) {
//                throw new RuntimeException(o, new Exception());
//            }
//
//            Class ch = URLClassLoader.newInstance(new URL[]{
//                new File("C:/123").toURL()}).loadClass(mass[0]);
//            Constructor constructor = ch.getConstructor(String.class);
//            Method m = ch.getDeclaredMethod("info");
//        }

//        String srt = "Java";
////        String srt1 = new String("Java");
//
//        Class stringClass = srt.getClass();
//        System.out.println(stringClass);

//        Class c = Class.forName("java.lang.String");
//        System.out.println(c);

//        Cat cat = new Cat("Vaska", "red", 10);
//        Class c = Cat.class;
//        Method[] methods = c.getDeclaredMethods();
//
//        for (Method m: methods ) {
//            System.out.println(m);
//        }

        Class c = Cat.class;
        Cat cat = new Cat("Vaska", "red", 10);
        Method[] methods = c.getDeclaredMethods();

        for (Method m: methods ) {
            if (m.isAnnotationPresent(MyAnon.class)) {
                m.invoke(cat);
                System.out.println(m.getAnnotation(MyAnon.class).priotity());
            }
        }


//        cat.publicInfo();
////
//        Class c = Cat.class;
////        Field field = c.getDeclaredField("age");
////        field.setAccessible(true);
////        field.set(cat, 5);
////        cat.publicInfo();

//        Method m = c.getDeclaredMethod("privateInfo");
//        m.setAccessible(true);
//        m.invoke(cat);

//        Field[] fields = c.getDeclaredFields();
//        for (Field o: fields) {
//            System.out.println(o);
//        }


        //Cat cat = (Cat) c.newInstance();
//
//        Class ch = URLClassLoader.newInstance(new URL[]{
//                new File("C:/123").toURL()}).loadClass("Human");
//        Constructor constructor = ch.getConstructor(String.class);
//        Object human = constructor.newInstance("Bob");
//        Method m = ch.getDeclaredMethod("info");
//        m.invoke(human);

    }
}
