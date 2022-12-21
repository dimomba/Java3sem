package task4x41x10;

public abstract class Transport {
    protected String name;
    protected String time;
    protected int cost;
    protected int speed;
    public Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public void setTime() {
        this.time = String.format("%.2f", (100.0 / speed));
    }
    abstract void setCost();
    @Override
    public String toString() {
        setTime();
        setCost();
        return name + "{Время в пути (100км): " + time + "ч, Стоимость: " + cost + "}";
    }
}
