package task4x41x1;

public abstract class Shape {
    abstract String getType();
    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString() {
        return getType() + ": Area = " + String.format("%.2f", getArea()) + ", Perimeter = " + String.format("%.2f", getPerimeter());
    }
}
