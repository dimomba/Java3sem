package task4x41x1;

public class Rectangle extends Shape {
    private double a, b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public String getType() {
        return "Rectangle";
    }
    @Override
    public double getArea() {
        return a * b;
    }
    @Override
    public double getPerimeter() {
        return a * 2 + b * 2;
    }
}
