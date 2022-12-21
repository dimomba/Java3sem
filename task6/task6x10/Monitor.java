package task6x10;

public class Monitor
{
    private double size;
    private int rate;

    public double getSize() {
        return size;
    }
    public int getRate() {
        return rate;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public String toString()
    {
        return "Диагональ монитора: " + size + "', частота: " + rate + "Hz";
    }
}
