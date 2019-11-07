package Lesson_5.DZ;

public class Comment {
}

//public class Tunnel extends Stage {
//
//    static Semaphore smp = new Semaphore(2);
//
//    public Tunnel() {
//
//        this.length = 80;
//        this.description = "Тоннель " + length + " метров";
//
//    }
//
//    @Override
//    public void go(Car c) {
//
//        try {
//
//            try {
//
//                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
//                smp.acquire();
//                System.out.println(c.getName() + " начал этап: " + description);
//                Thread.sleep(length / c.getSpeed() * 1000);
//                smp.release();
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println(c.getName() + " закончил этап: " + description);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//    ///////////
//    определение победителя
//
//public class Car implements Runnable {
//
//    private static int CARS_COUNT;
//    static Car winCar;
//
//    static {
//        CARS_COUNT = 0;
//        winCar = null;
//    }
//    private Race race;
//    private int speed;
//    private String name;
//    private final CountDownLatch START;
//    private final CyclicBarrier READY;
//    private final CyclicBarrier FINISH;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public Car(Race race, int speed, CyclicBarrier READY, CountDownLatch START, CyclicBarrier FINISH) {
//        this.race = race;
//        this.speed = speed;
//        CARS_COUNT++;
//        this.name = "Участник #" + CARS_COUNT;
//        this.READY = READY;
//        this.START = START;
//        this.FINISH = FINISH;
//    }
//
//    @Override
//    public void run() {
//        try {
//            System.out.println(this.name + " готовится");
//            Thread.sleep(500 + (int) (Math.random() * 800));
//            System.out.println(this.name + " готов");
//            READY.await();
//            START.countDown();
//            START.await();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < race.getStages().size(); i++) {
//            race.getStages().get(i).go(this);
//        }
//        if (winCar == null){
//            winCar = this;
//            System.out.println(this.name + " WIN!");
//        }
//        try {
//            FINISH.await();
//        } catch (InterruptedException|BrokenBarrierException e){
//            e.printStackTrace();
//        }
//    }
//}
//
//
//////////////