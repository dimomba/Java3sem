package task4x41x6;

public class Tester {
    public static void main(String[] args) {
        Employer[] arr = new Employer[4];
        arr[0] = new Employer("Иван", "Иванов", 40000);
        arr[1] = new Manager("Петр", "Петров", 45000, 5000);
        arr[2] = new Employer("Савелий", "Савельев", 35000);
        arr[3] = new Manager("Олег", "Григорьев", 48000, 6000);
        System.out.println("Employers:");
        for (int i = 0; i < 4; i++)
            if(arr[i].getClasss().equals("Employer"))
                System.out.println(arr[i]);
        System.out.println("Managers:");
        for (int i = 0; i < 4; i++)
            if(arr[i].getClasss().equals("Manager"))
                System.out.println(arr[i]);
    }
}