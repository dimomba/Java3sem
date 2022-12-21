package task2x1;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String mail;
        Author a1 = new Author("Ivan", "Ivan1998@mail.ru", 'M');
        System.out.println(a1.toString());
        Scanner source = new Scanner(System.in);
        System.out.println("Введите email ");
        mail = source.next();
        a1.setEmail(mail);
        System.out.println(a1.toString());
    }
}