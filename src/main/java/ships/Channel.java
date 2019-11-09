package ships;

import java.util.concurrent.Semaphore;

public class Channel extends Stage {
    private Semaphore smf;
    public Channel(int length, int ships){
        this.length = length;
        this.description = "Канал " + length + " км.";
        this.smf = new Semaphore(ships);
    }
    @Override
    public void pass(Ship ship){
        try {
            System.out.println(ship.getName() + " стоит в очереди в канал: " + description);
            smf.acquire();
            System.out.println(ship.getName() + " начал плыть по каналу: " + description);
            Thread.sleep(length / ship.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(ship.getName() + " вышел из канала: " + description);
            smf.release();
        }
    }
}
