package ships;

public abstract class Stage {
    protected int length;
    protected String description;

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    public abstract void pass (Ship ship);
}
