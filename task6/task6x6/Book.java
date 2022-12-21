package task6x6;

class Book implements Printable
{
    private String name;
    private String author;

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print()
    {
        System.out.println("Книга: " + name + ", " + author);
    }
}
