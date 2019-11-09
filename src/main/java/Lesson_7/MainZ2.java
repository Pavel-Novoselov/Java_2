package Lesson_7;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class MainZ2 {

    public static void main(String[] args) throws Exception {

        File file = new File("D:\\Dropbox\\GeekBrain\\Java_2\\123");
        String[] str = file.list();

        for (String o: str) {
            String[] mass = o.split("\\.");

            if(!mass[1].equalsIgnoreCase("class")) {
                throw new RuntimeException(o, new Exception());
            }

            Class ch = URLClassLoader.newInstance(new URL[]{
                    new File("D:\\Dropbox\\GeekBrain\\Java_2\\123").toURL()}).loadClass("Lesson_7."+mass[0]);

            Constructor constructor = ch.getConstructor();
            Method[] m = ch.getDeclaredMethods();

            Main1 main1 = (Main1) ch.newInstance();

            System.out.println("Проверка методов класса "+ch.getName());
            System.out.println(m[0].invoke(main1, 1));
            System.out.println(m[1].invoke(main1, 1,1,1,1));
            System.out.println(m[2].invoke(main1, 2,4,5,6f));
            System.out.println(m[3].invoke(main1, 1,2));
            m[4].invoke(main1, 1);
            m[5].invoke(main1,  "Pavel");
            System.out.println(m[6].invoke(main1, 2018));
        }

    }
}
