package task11x1;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tester {
    public static void main(String[] args) {
        String surname = "Орехов";
        System.out.println("Фамилия разработчика: " + surname);

        Calendar c = new GregorianCalendar(2022, 8, 25);
        Date now = c.getTime();
        System.out.println("Дата и время получения задания: " + now);

        Date get = new Date();
        System.out.println("Дата и время сдачи задания: " + get);
    }
}