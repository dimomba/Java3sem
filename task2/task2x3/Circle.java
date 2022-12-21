package task2x3;
public class Circle {
    private Point mid;
    private double r;

    public Circle(Point mid, double r)
    {
        this.mid = mid;
        this.r = r;
    }

    public Point getMid() { return mid; }
    public void setMid(Point mid) { this.mid = mid; }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public void move(double xDisp, double yDisp)
    {
        this.mid.setX(mid.getX() + xDisp);
        this.mid.setY(mid.getY() + yDisp);
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + mid.getX() +", y=" + mid.getY() + ", r=" + r + '}';
    }
}