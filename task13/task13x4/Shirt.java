package task13x4;

public class Shirt
{
    private String articleNumber;
    private String name;
    private String color;
    private String size;
    private String[] s;

    public Shirt(String string)
    {
        this.s = string.split(",");
        this.articleNumber = this.s[0];
        this.name = this.s[1];
        this.color = this.s[2];
        this.size = this.s[3];
    }

    @Override
    public String toString()
    {
        return "Артикул: " + articleNumber + ";    Название: " + name + ";    Цвет: " + color + ";    Размер: " + size;
    }
}