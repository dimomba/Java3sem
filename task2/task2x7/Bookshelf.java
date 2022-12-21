package task2x7;
import java.util.Scanner;

public class Bookshelf {
    private int len;
    private Book[] arr = new Book[len];
    public Bookshelf(int len)
    {
        this.len = len;
        this.arr = new Book[len];
        for(int i = 0; i < len; i++)
        {
            Scanner source = new Scanner(System.in);
            System.out.println("Введите автора книги");
            String author = source.next();
            System.out.println("Введите название книги");
            String name = source.next();
            System.out.println("Введите год написания книги");
            int year = source.nextInt();
            System.out.println("Введите количество страниц в книге");
            int cnt = source.nextInt();
            arr[i] = new Book(author, name, year, cnt);
        }
    }

    public Book[] getArr() {
        return arr;
    }

    public Book maxYear()
    {
        int mx = 0;
        Book bk = arr[0];
        for(int i = 0; i < len; i++)
        {
            if (arr[i].getYear() > mx) {
                bk = arr[i];
                mx = arr[i].getYear();
            }
        }
        return bk;
    }

    public Book minYear()
    {
        int mn = 2022;
        Book bk = arr[0];
        for(int i = 0; i < len; i++) {
            if (arr[i].getYear() < mn) {
                bk = arr[i];
                mn = arr[i].getYear();
            }
        }
        return bk;
    }

    public void sortBooks()
    {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < len; i++)
            {
                if (arr[i].getYear() < arr[i - 1].getYear())
                {
                    Book temp;
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    needIteration = true;
                }
            }
        }
    }
}
