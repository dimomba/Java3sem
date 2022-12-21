package task2x6;


public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double Square()
    {
        return Math.PI * r * r;
    }

    public double Length()
    {
        return 2 * Math.PI * r;
    }

    public void Compare(Circle c2)
    {
        if (r > c2.getR())
            System.out.println("Окружность 1 больше окружности 2");
        else if (r == c2.getR())
            System.out.println("Окружности равны");
        else if (r < c2.getR())
            System.out.println("Окружность 2 больше окружности 1");
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x +", y=" + y + ", r=" + r + '}';
    }
}
