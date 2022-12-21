package task4x3;

public class Boots extends Shoes{
    public Boots(SizeForShoe size, int cost, String color)
    {
        this.setSize(size);
        this.setCost(cost);
        this.setColor(color);
    }
    @Override
    public String toString() {
        return "Boots {" + "Size: " + getSize() + ", Cost: " + getCost() + ", Color: " + getColor() + '}';
    }
}
