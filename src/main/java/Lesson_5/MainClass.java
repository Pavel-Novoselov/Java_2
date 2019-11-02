package Lesson_5;

import java.util.concurrent.atomic.AtomicInteger;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static AtomicInteger start_count= new AtomicInteger(0);
    public static AtomicInteger finish_count = new AtomicInteger(0);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
    }

    public static void start_count(){
        start_count.incrementAndGet();
        if (start_count.get()==1)
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
    }

    public static void finish_count(Car car){
        finish_count.incrementAndGet();

        if(finish_count.get()==1)
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Победитель, "+car.getName()+" Скорость "+car.getSpeed());

        if(finish_count.get()==CARS_COUNT)
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");

        System.out.println(car.getName()+" финишировал, скорость "+car.getSpeed());
    }
}
