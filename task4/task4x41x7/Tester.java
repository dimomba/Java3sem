package task4x41x7;

public class Tester {
    public static void main(String[] args) {
        Learner[] arr = new Learner[4];
        arr[0] = new Schoolboy("Иван", "Иванов", 12, "6А");
        arr[1] = new Student("Петр", "Петров", 20, "ИКБО-10-20");
        arr[2] = new Schoolboy("Савелий", "Савельев", 14, "8Б");
        arr[3] = new Student("Олег", "Григорьев", 19, "ИКБО-30-21");
        System.out.println("Schoolboys:");
        for (int i = 0; i < 4; i++)
            if(arr[i].getClasss().equals("Schoolboy"))
                System.out.println(arr[i]);
        System.out.println("Students:");
        for (int i = 0; i < 4; i++)
            if(arr[i].getClasss().equals("Student"))
                System.out.println(arr[i]);
    }
}