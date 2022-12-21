package task4x41x8;

public class Square extends Rectangle {
    protected double side;

    public Square(){}

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
    }
    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        this.setWidth(getSide());
        this.setLength(getSide());
        return getType() + ": Area = " + String.format("%.2f", getArea()) + ", Perimeter = " + String.format("%.2f", getPerimeter());
    }

}
