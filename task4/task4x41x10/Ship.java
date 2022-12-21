package task4x41x10;

public class Ship extends Transport {
    public Ship(String name, int speed) {
        super(name, speed);
    }

    public void setCost() {
        this.cost = 2 * speed;
    }
}
