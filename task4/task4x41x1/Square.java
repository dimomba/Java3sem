package task4x41x1;

public class Square extends Shape {
    private double a;
    public Square(double a) {
        this.a = a;
    }
    @Override
    public String getType() {
        return "Square";
    }
    public double getA() {
        return a;
    }
    @Override
    public double getArea() {
        return a * a;
    }
    @Override
    public double getPerimeter() {
        return a * 4;
    }
}
