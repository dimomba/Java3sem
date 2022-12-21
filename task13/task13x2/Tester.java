package task13x2;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = sc.nextLine();
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        System.out.print("Введите отчество: ");
        String patronymic = sc.nextLine();

        Person person = new Person(surname, "" + name, "" + patronymic);
        System.out.println(person);
    }
}