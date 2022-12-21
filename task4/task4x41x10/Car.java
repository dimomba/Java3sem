package task4x41x10;

public class Car extends Transport {
    public Car(String name, int speed) {
        super(name, speed);
    }

    public void setCost() {
        this.cost = 10 * speed;
    }
}
