package task4x2;

public class Pants extends Clothes {
    public Pants(Size size, int cost, String color)
    {
        this.setSize(size);
        this.setCost(cost);
        this.setColor(color);
    }
    @Override
    public String toString() {
        return "Pants{" + "Size: " + getSize() + ", Cost: " + getCost() + ", Color: " + getColor() + '}';
    }
}
