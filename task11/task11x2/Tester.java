package task11x2;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tester {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int day = sc.nextInt();
        System.out.println("Введите номер месяца:");
        int month = sc.nextInt();
        System.out.println("Введите год:");
        int year = sc.nextInt();

        Calendar c = new GregorianCalendar(year, month - 1, day);
        Date date = c.getTime();
        Date now = new Date();

        if(now.before(date))
            System.out.println("Введенная дата больше системного времени");
        else
            System.out.println("Введенная дата меньше системного времени");
    }
}
