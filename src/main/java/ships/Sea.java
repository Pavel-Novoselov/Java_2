package ships;

public class Sea extends Stage {
    public Sea (int length){
        this.length = length;
        this.description = "Море "+length+" км.";
    }

    @Override
    public void pass (Ship ship){
        try {
 //           System.out.println(ship.getName() + " начал этап: " + description);
            Thread.sleep(length / ship.getSpeed() * 1000);
            System.out.println(ship.getName() + " переплыл: " + description);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
