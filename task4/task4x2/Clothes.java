package task4x2;

public abstract class Clothes {
    private Size size;
    private int cost;
    private String color;

    public void setSize(Size size) {
        this.size = size;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
