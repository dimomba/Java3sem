package task7x7;

class Book implements Printable
{
    private String name;

    public Book(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}
