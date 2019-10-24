package Lesson_1.task3;

public class Fruit {
    private String name;
    private float weight;
    private boolean inBox = false;

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setInBox(boolean inBox) {
        this.inBox = inBox;
    }

    public boolean isInBox(){
        if (this.inBox)
            return true;
        else
            return false;
    }

}
