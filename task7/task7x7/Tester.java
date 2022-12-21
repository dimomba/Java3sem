package task7x7;

public class Tester
{
    public static void main(String[] args)
    {
        Printable[] printable = {new Book("Бородино"),
                new Magazine("Times"),
                new Book("Отцы и дети"),
                new Magazine("Forbes")};
        System.out.println("Книги:");
        Printable.printBooks(printable);
        System.out.println("Журналы:");
        Printable.printMagazine(printable);
    }
}
