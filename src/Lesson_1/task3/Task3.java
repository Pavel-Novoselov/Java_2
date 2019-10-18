package Lesson_1.task3;

public class Task3 {
    public static void main(String[] args) {
//создаем много фркутов
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();
        Apple a5 = new Apple();
        Apple a6 = new Apple();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();
        Orange o4 = new Orange();
        Orange o5 = new Orange();
        Orange o6 = new Orange();
//создаем несколько коробок, сразу инициализируя их первым фруктом
        Box<Apple> box1 = new Box<>(a1);
        Box<Apple> box2 = new Box<>(a6);
        Box<Orange> box3 = new Box<>(o1);
        Box<Orange> box4 = new Box<>(o2);
//раскладываем фрукты по коробкам
        box1.setFruits(a2);
        box1.setFruits(a3);
        box1.setFruits(a4);
        box1.setFruits(a5);
//а этот уже лежит в другой коробке -
        box2.setFruits(a5);
//раскладываем фрукты по коробкам
        box3.setFruits(o3);
        box3.setFruits(o4);
        box3.setFruits(o6);
        box4.setFruits(o5);
//пересыпаем из box1 в box2
        moveToAnotherBox(box1, box2);
        box2.info();

        moveToAnotherBox(box2, box3);
        box3.info();

        moveToAnotherBox(box3, box3);
        box3.info();

        moveToAnotherBox(box3, box4);
        box4.info();
        
        //сравниваем коробки по весу
        System.out.println("box1 has the same weight than box2? "+box1.compare(box2));
        System.out.println("box1 has the same weight than box3? "+box1.compare(box3));
        System.out.println("box2 has the same weight than box3? "+box2.compare(box4));

    }
//решил оставить медот пересыпки здесь, т.к. больше негде...
    public static void moveToAnotherBox (Box fromBox, Box toBox){

        System.out.println("Removing fruits from one box to another:");
        System.out.print(fromBox.getType()+" ");
        System.out.println(fromBox.getAmount());
        System.out.print(toBox.getType()+" ");
        System.out.println(toBox.getAmount());

        if (fromBox.getType().equals(toBox.getType()) && !fromBox.equals(toBox)){
            for (int i = 0; i < fromBox.getAmount(); i++) {
                toBox.setFruits(fromBox.getFruitNoRemove(i));
            }
            fromBox.setEmpty();
            System.out.println("Remove done, now result is "+toBox.getAmount());
        } else
            System.out.println("Remove is impossible! Different types or boxes are similar!");
    }
}
