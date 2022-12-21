package task4x41x10;

public class Plane extends Transport {
    public Plane(String name, int speed) {
        super(name, speed);
    }

    public void setCost() {
        this.cost = 3 * speed;
    }
}
