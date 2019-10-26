package main.java.Lesson_3.task4;

import java.io.Serializable;

public class ClassJavaDeveloper implements Serializable {
    private int id;
    private String name;
    private int score;

    public ClassJavaDeveloper(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void info(){
        System.out.println(id+" "+name+" "+score);
    }
}
