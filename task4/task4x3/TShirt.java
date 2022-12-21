package task4x3;

import task4x3.Clothes;

public class TShirt extends Clothes {

    public TShirt(Size size, int cost, String color)
    {
        this.setSize(size);
        this.setCost(cost);
        this.setColor(color);
    }
    @Override
    public String toString() {
        return "TShirt {" + "Size: " + getSize() + ", Cost: " + getCost() + ", Color: " + getColor() + '}';
    }
}
