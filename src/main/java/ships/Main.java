package ships;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static final int SHIPS_COUNT = 6;
    public static AtomicInteger start_count= new AtomicInteger(0);
    public static AtomicInteger finish_count = new AtomicInteger(0);

    public static void main(String[] args) {
        Port port1 = new Port("Source", "Fuel", 1000, 1);
        Port port2 = new Port("Source", "Food", 2000, 1);
        Port port3 = new Port("Source", "Clothes", 3000, 1);
        Port[] portS = {port1, port2, port3};
        Port portD = new Port("Destination", "All goods", 0, 2);
        Way way = new Way(SHIPS_COUNT, portS, new Sea(60), new Channel(10, 1), new Sea(40), portD);
        Ship[] ships = new Ship[SHIPS_COUNT];
        for (int i = 0; i < ships.length; i++) {
            ships[i] = new Ship(way, 150 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < ships.length; i++) {
            new Thread(ships[i]).start();
        }

    }

    public static void start_count(){
        start_count.incrementAndGet();
        if (start_count.get()==1)
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Корабли поплыли!");
    }

    public static void finish_count(Ship ship){
        finish_count.incrementAndGet();

        if(finish_count.get()==SHIPS_COUNT)
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Все корабли остановились!");

    }
}
