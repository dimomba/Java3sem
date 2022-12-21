package task7x7;

public interface Printable
{
    public static void printMagazine(Printable[] printable)
    {
        for (int i = 0; i < printable.length; i++)
        {
            if(printable[i].getClass() == Magazine.class) System.out.println(printable[i]);
        }
    }
    public static void printBooks(Printable[] printable)
    {
        for (int i = 0; i < printable.length; i++)
        {
            if(printable[i] instanceof Book) {
                System.out.println(printable[i]);
            }
        }
    }
}
