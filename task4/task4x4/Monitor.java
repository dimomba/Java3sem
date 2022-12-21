package task4x4;

public class Monitor {
    private String model;
    private double size;
    private String display;
    public Monitor(String model, double size, String display)
    {
        this.model = model;
        this.size = size;
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "Monitor {Model: " + getModel() + ", Size: " + getSize() + "', Display: " + getDisplay() + "}";
    }
}
