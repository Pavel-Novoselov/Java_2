package Lesson_7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.io.File;
import static java.lang.Math.*;

public class MainRef {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, MalformedURLException, InstantiationException {
      //try cath finally thow thows
        //  sqrt();
        //        Class c = Class.forName("java.lang.String");
//        System.out.println(c);

//        Class c = Cat.class;
//
//        Field[] fields = c.getDeclaredFields();
//
//        for (Field o: fields) {
//            System.out.println(o);
//        }

//        Cat cat = new Cat("Barsik", "White", 2);
//
//        Class c = Cat.class;
//        cat.info();
//
//        Field f = c.getDeclaredField("age");
//        int mods = f.getModifiers();
//        System.out.println(mods);

//        Method f = c.getDeclaredMethod("info2");
//
//        f.setAccessible(true);
//        f.invoke(cat);

        //cat.info();

//        Class ch = URLClassLoader.newInstance(new URL[]
//                {new File("/123").toURL()}).loadClass("Human");
//
//        Constructor constructor = ch.getConstructor(String.class);
//
//        Method[] method = ch.getDeclaredMethods();
//
//        for (Method m :method ) {
//            System.out.println(m);
//        }
//
//
//        Object human = constructor.newInstance("Bob");
//        Method m = ch.getDeclaredMethod("info");
//
//        m.invoke(human);

//        Class c = Cat.class;
//        Cat cat = new Cat("C", "c", 10);
//
//        Method[] m = c.getDeclaredMethods();
//        for (Method o: m) {
//            if(o.isAnnotationPresent(MyAnon.class)) {
//                System.out.println(o.getAnnotation(MyAnon.class).priotity());
//                o.invoke(cat);
//            }
//        }
//        Class c = Students.class;
//
//        String tableName = ((XTable)c.getAnnotation(XTable.class)).name();
//
//        System.out.println(tableName);
        m1(7);

    }

    public static void m1(Integer o) {

    }

}
