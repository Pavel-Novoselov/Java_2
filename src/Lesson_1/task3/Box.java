package Lesson_1.task3;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private String type;
    private F e;
    private ArrayList<F> arrayList;
    private float weight;

    public Box(F e) {
        if (!e.isInBox()) {
            this.type = e.getName();
            this.weight = e.getWeight();
            this.arrayList = new ArrayList<>();
            arrayList.add(e);
            e.setInBox(true);
        }
        else
            System.out.println("This fruit has already in box! Choose another one!");
 }

    public int getAmount() {
        return arrayList.size();
    }

    public String getType() {
        return type;
    }

    public F getFruitNoRemove(int i) {
        e= arrayList.get(i);
//        arrayList.remove(i);
        e.setInBox(false);
        return e;
    }

    public void setFruits(F e) {
        if (!e.isInBox()) {
            arrayList.add(e);
            e.setInBox(true);
        }
        else
            System.out.println("This fruit has already in box! Choose another one!");
    }

    public void setEmpty(){
        arrayList.clear();
    }

    public float getTotalWeight (){
        return arrayList.size() * weight;
    }

    public void info(){
        System.out.println("In this box: "+ arrayList.size()+" "+this.getType());
    }

    public boolean compare (Box<?> another){
        if (this.getTotalWeight() == another.getTotalWeight()){
            return true;
        } else
            return false;
    }
}
