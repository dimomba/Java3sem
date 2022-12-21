package task7x7;

class Magazine implements Printable
{
    private String name;

    public Magazine(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}
