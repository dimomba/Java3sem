package task4x41x5;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Reader[] arr = new Reader[2];
        arr[0] = new Reader("Иванов К. Н.", "65526", "Программная инженерия", "18.05.2001", "88006547892");
        arr[1] = new Reader("Петров А. Е.", "25769", "Физика", "03.07.2002", "88002452165");
        arr[0].takeBook(5);
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите названия книг, которые нужно взять. Чтобы закончить ввод, введите take");
        String s = sc.nextLine();
        arr[0].takeBook(s);

        System.out.println("Введите названия книг, которые нужно вернуть. Чтобы закончить ввод, введите return");
        s = sc.nextLine();
        arr[1].returnBook(s);
        String name, author;

        System.out.println("Введите названия книг, которые нужно взять, и их авторов. Чтобы закончить ввод, введите take");
        name = sc.nextLine();
        author = sc.nextLine();
        Book book = new Book(name, author);
        arr[0].takeBook(book);

        System.out.println("Введите названия книг, которые нужно вернуть, и их авторов. Чтобы закончить ввод, введите return");
        name = sc.nextLine();
        author = sc.nextLine();
        book = new Book(name, author);
        arr[1].returnBook(book);
    }
}
