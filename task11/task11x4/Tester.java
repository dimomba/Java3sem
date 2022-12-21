package task11x4;

import java.text.SimpleDateFormat;
import java.util.*;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        System.out.print("Введите месяц: ");
        int month = sc.nextInt();
        System.out.print("Введите число: ");
        int day = sc.nextInt();
        System.out.print("Введите час: ");
        int hour = sc.nextInt();
        System.out.print("Введите минуту: ");
        int minute = sc.nextInt();

        Calendar c = new GregorianCalendar(year, month - 1, day);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minute);

        Date date = c.getTime();
        SimpleDateFormat simpleDate = new SimpleDateFormat("YYYY, MMMM d, HH:mm");
        System.out.println(simpleDate.format(date));
    }
}