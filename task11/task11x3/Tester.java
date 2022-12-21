package task11x3;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.nextLine();
        System.out.println("Введите день рождения:");
        int day = sc.nextInt();
        System.out.println("Введите месяц рождения:");
        int month = sc.nextInt();
        System.out.println("Введите год рождения:");
        int age = sc.nextInt();
        Student student = new Student(name, day, month, age);
        System.out.println(student);
    }
}