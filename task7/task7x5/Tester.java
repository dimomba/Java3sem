package task7x5;

public class Tester
{
    public static void main(String[] args)
    {
        ProcessString s = new ProcessString("123456789");
        System.out.println("Количество символов строки: " + s.counter());
        System.out.println("Строка из символов с нечетной позицией: " + s.symb135());
        System.out.println("Инвертированная строка: " + s.inversion());
    }
}
