package task4x4;

public class Processor {
    private String model;
    private double speed;
    private int CountOfUnits;
    public Processor(String model, double speed, int CountOfUnits)
    {
        this.model = model;
        this.speed = speed;
        this.CountOfUnits = CountOfUnits;
    }

    public int getCountOfUnits() {
        return CountOfUnits;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        return "CPU {Model: " + getModel() + ", Speed: " + getSpeed() + "GHz, CountOfUnits: " + getCountOfUnits() + "}";
    }
}
