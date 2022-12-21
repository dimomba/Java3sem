package task19x2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Иван Иванов", 100, 30, 19));
        s.add(new Student("Петр Петров", 88, 20, 20));
        s.add(new Student("Василий Васильев", 77, 10, 18));

        new LabClassUI(s);
    }

}