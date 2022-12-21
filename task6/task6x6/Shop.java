package task6x6;

class Shop implements Printable
{
    private String name;

    public Shop(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println("Магазин: " + name);
    }
}
