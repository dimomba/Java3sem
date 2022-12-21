package task4x41x8;

public class Rectangle extends Shape{
    protected double width, length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return width * 2 + length * 2;
    }
    @Override
    public String toString() {
        return getType() + ": Area = " + String.format("%.2f", getArea()) + ", Perimeter = " + String.format("%.2f", getPerimeter());
    }
}
