package task6x6;

public class Tester
{
    public static void main(String[] args)
    {
        Printable[] a = {new Shop("Читай город"),
                new Book("Бородино", "М. Ю. Лермонтов"),
                new Book("Отцы и дети", "И. С. Тургенев")};
        for (int i = 0; i < a.length; i++)
        {
            a[i].print();
        }
    }
}