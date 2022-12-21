package task4x4;

public class Memory {
    private String model;
    private int capacity;
    private int speed;
    public Memory(String model, int capacity, int speed)
    {
        this.model = model;
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        return "RAM {Model: " + getModel() + ", Capacity: " + getCapacity() + "GB, Speed: " + getSpeed() + "MHz}";
    }
}
