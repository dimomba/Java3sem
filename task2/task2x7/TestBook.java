package task2x7;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("Введите количество книг на книжной полке");
        int len = source.nextInt();
        Bookshelf bkshlf = new Bookshelf(len);
        for(int i = 0; i < len; i++)
            System.out.println(bkshlf.getArr()[i].toString());
        System.out.println("---------------------");
        System.out.println(bkshlf.minYear().toString()); //минимальный год написания
        System.out.println(bkshlf.maxYear().toString()); //максимальный год написания
        System.out.println("---------------------");
        bkshlf.sortBooks();
        for(int i = 0; i < len; i++)
            System.out.println(bkshlf.getArr()[i].toString());
    }
}
