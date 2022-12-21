package task4x41x9;

public class Chair extends  Furniture {
    private String name;

    public Chair(String color, String material, int cost, String name) {
        super(color, material, cost);
        this.name = name;
    }
    @Override
    public String toString() {
        return name + " {Color: " + color + ", Material: " + material + ", cost: " + cost + "}";
    }
}
