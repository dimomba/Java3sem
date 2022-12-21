package task4x3;

import task4x3.Clothes;

public class Skirt extends Clothes {
    public Skirt(Size size, int cost, String color)
    {
        this.setSize(size);
        this.setCost(cost);
        this.setColor(color);
    }
    @Override
    public String toString() {
        return "Skirt {" + "Size: " + getSize() + ", Cost: " + getCost() + ", Color: " + getColor() + '}';
    }
}
