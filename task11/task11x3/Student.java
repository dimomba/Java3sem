package task11x3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    private String name;
    private Calendar calendar = new GregorianCalendar();
    private Date date;
    private SimpleDateFormat dateFormat;

    public Student(String name, int day, int month, int year) {
        this.name = name;

        this.calendar = new GregorianCalendar(year, month - 1, day);
        this.dateFormat = new SimpleDateFormat("d MMMM YYYY");
        this.date = calendar.getTime();
    }

    public void setName(String name) {
        this.name = name;
    }



    public String toString() {
        return name + ". Дата рождения: " + dateFormat.format(date);
    }
}
