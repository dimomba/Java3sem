package task4x41x8;

public class Circle extends Shape {
    protected double r;

    public Circle(){};

    public Circle(double r) {
        this.r = r;
    }

    public Circle(String color, boolean filled, double r) {
        super(color, filled);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String getType() {
        return "Circle";
    }
    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }
    @Override
    public String toString() {
        return getType() + ": Area = " + String.format("%.2f", getArea()) + ", Perimeter = " + String.format("%.2f", getPerimeter());
    }
}
