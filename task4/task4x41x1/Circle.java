package task4x41x1;

public class Circle extends Shape {
    private double r;
    public Circle(double r) {
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
}
