package ships;

public class Ship implements Runnable {
    private static int FUEL_CAPACITY = 300;
    private static int FOOD_CAPACITY = 500;
    private static int CLOTHES_CAPACITY = 700;
    private static int SHIP_COUNT = 0;
    private static int SPEED = 10;
    private Way way;
    private int speed;
    private String name;
    private String type;
    private int capacity;
    private int amount;

    public Ship(Way way, int speed) {
        this.way = way;
        this.speed = speed;
        SHIP_COUNT++;
        this.name = "Корабль № "+SHIP_COUNT;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setType(String type) {
        this.type = type;
        setCapacity(type);
    }

    public void setCapacity(String type) {
        switch (type){
            case("Fuel"):
                this.capacity = FUEL_CAPACITY;
                break;
            case("Food"):
                this.capacity = FOOD_CAPACITY;
                break;
            case("Clothes"):
                this.capacity = CLOTHES_CAPACITY;
                break;
            default:
                this.capacity=0;
                break;
        }
    }

    @Override
    synchronized public void run() {

        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            way.getCyclicBarrier().await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Main.start_count();

        while (true) {
//выбор порта и загрузка
            int a, sum=0;
            for (int i = 0; i < way.getPorts().size(); i++) {
                a= way.getPorts().get(i).getAmount();
                sum+=a;
                if (a>0) {
                    way.getPorts().get(i).pass(this);
                    break;
                }
            }
//если во всех портах ничего нет - выход из цикла - корабль останавливается
            if ((amount==0)&&(sum==0))
                break;
//путь туда и разгрузка
            for (int i = 0; i < way.getStages().size(); i++) {
                way.getStages().get(i).pass(this);
 //               System.out.println("Way forward");
            }

//путь назад
            for (int j = way.getStages().size()-2; j >= 1; j--) {
                way.getStages().get(j).pass(this);
//                System.out.println("Way back");
            }

        }
        System.out.println(name+" вернулся в гавань");

        Main.finish_count(this);
    }


}
