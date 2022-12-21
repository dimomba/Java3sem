package task6x10;

public class Processor
{
    private String name;
    private double rate;

    public Processor(){}

    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public String toString()
    {
        return "Процессор: " + name + ", частота: " + rate + "GHz";
    }
}
