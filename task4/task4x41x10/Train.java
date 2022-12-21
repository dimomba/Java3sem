package task4x41x10;

public class Train extends Transport {
    public Train(String name, int speed) {
        super(name, speed);
    }

    public void setCost() {
        this.cost = 5 * speed;
    }
}
