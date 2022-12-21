package task4x41x5;

import java.util.Scanner;

public class Reader {
    private String name;
    private String number;
    private String faculty;
    private String date;
    private String phone;
    public Reader(String name, String number, String faculty, String date, String phone) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.date = date;
        this.phone = phone;
    }
    public void takeBook(int cnt) {
        System.out.println(name + " взял " + cnt + " книг");
    }

    public void takeBook(String s) {
        String list = ": ";
        while(!s.equals("take"))
        {
            list = list + s + ", ";
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
        }
        list = list.substring(0, list.length() - 2);
        System.out.println(name + " взял книги" + list);
    }

    public void takeBook(Book book) {
        String list = ": ";
        while(!book.getName().equals("take") & !book.getAuthor().equals("take"))
        {
            list = list + book.getName() + " (" + book.getAuthor() + "), ";
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            if (name.equals("take"))
                break;
            String author = sc.nextLine();
            book = new Book(name, author);
        }
        list = list.substring(0, list.length() - 2);
        System.out.println(name + " взял книги" + list);
    }


    public void returnBook(int cnt) {
        System.out.println(name + " вернул " + cnt + " книг");
    }

    public void returnBook(String s) {
        String list = ": ";
        while(!s.equals("return"))
        {
            list = list + s + ", ";
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
        }
        list = list.substring(0, list.length() - 2);
        System.out.println(name + " вернул книги" + list);
    }

    public void returnBook(Book book) {
        String list = ": ";
        while(!book.getName().equals("return") & !book.getAuthor().equals("return"))
        {
            list = list + book.getName() + " (" + book.getAuthor() + "), ";
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            if (name.equals("return"))
                break;
            String author = sc.nextLine();
            book = new Book(name, author);
        }
        list = list.substring(0, list.length() - 2);
        System.out.println(name + " вернул книги" + list);
    }
}
