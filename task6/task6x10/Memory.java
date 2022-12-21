package task6x10;

public class Memory
{
    private int capacity;
    private int rate;

    public Memory(){}

    public int getCapacity() {
        return capacity;
    }
    public int getRate() {
        return rate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public String toString()
    {
        return "Объем памяти: " + capacity + "GB, частота: " + rate + "MHz";
    }
}
