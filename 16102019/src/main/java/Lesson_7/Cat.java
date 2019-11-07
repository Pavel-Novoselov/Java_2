package Lesson_7;

import Lesson_7.AnonPresent.MyAnon;

public class Cat {

    String name;
    public String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @MyAnon
    public void test1() {
        System.out.println("test1");
    }

    @MyAnon(priotity = 2)
    public void test2() {
        System.out.println("test2");
    }
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void publicInfo() {
        System.out.println(name + " " + color + " " + age);
    }

    private void privateInfo(int a) {
        System.out.println("private" + name + " " + color + " " + age);
    }
}
