package task3xOtchet;

public class Otchet {
    public static void main(String[] args)
    {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Иван Иванов", 25834.7);
        arr[1] = new Employee("Петр Петров", 31634.48);
        arr[2] = new Employee("Савелий Савельев", 28091.9);
        for(int i = 0; i < 3; i++)
            arr[i].generateReport();
    }
}
