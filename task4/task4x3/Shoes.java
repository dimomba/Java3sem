package task4x3;

public abstract class Shoes {
    private SizeForShoe size;
    private int cost;
    private String color;

    public void setSize(SizeForShoe size) {
        this.size = size;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SizeForShoe getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
