package ships;

import java.util.concurrent.Semaphore;

public class Port extends Stage {
    private static int PORTS = 0;
    private String name;
    private String type;
    private String goods;
    private int amount;
    private int ship_capacity;
    Semaphore smf;
    boolean isBusy = false;

    public Port(String type, String goods, int amount, int ship_capacity) {
        PORTS++;
        this.type = type;
        this.goods = goods;
        this.amount = amount;
        this.name = "Port #"+PORTS+", type - "+ type;
        this.smf = new Semaphore(ship_capacity);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getShip_capacity() {
        return ship_capacity;
    }

    public void setShip_capacity(int ship_capacity) {
        this.ship_capacity = ship_capacity;
    }

    @Override
    public void pass(Ship ship) {

        if (this.type.equals("Source")) { //если порт источник грузов
            try {
                System.out.println(ship.getName()+" стоит в очереди в порт");
                smf.acquire();
                isBusy = true;
                System.out.println(name+": "+ship.getName() + " начал погрузку");
                ship.setType(this.goods);
                ship.setAmount(Math.min(ship.getCapacity(), this.getAmount()));
                this.setAmount(this.getAmount()-ship.getAmount());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(name+": "+ship.getName() + " закончил погрузку: "+ goods+ " в количестве "+ship.getAmount());
                System.out.println("В порту осталось "+getAmount()+" "+getGoods());
                isBusy=false;
                smf.release();
            }
        } else { //если порт - приемник грузов
            try {
                System.out.println(ship.getName()+" стоит в очереди в порт");
                smf.acquire();
                System.out.println(name+": "+ship.getName() + " начал разгрузку");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(name+": "+ship.getName() + " закончил разгрузку: "+ ship.getType()+ " в количестве "+ship.getAmount());
                ship.setType("");
                this.setAmount(this.getAmount()+ship.getAmount());
                ship.setAmount(0);
                System.out.println("В порту стало "+getAmount()+" "+getGoods());
                smf.release();
            }
        }
    }
}
