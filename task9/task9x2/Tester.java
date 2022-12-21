package task9x2;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Введите количество студентов:");
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        SortingStudentByGPA array = new SortingStudentByGPA(cnt);

        System.out.println("Изначальный массив:");
        array.print();

        array.quickSort(array.getArray(), 0, cnt-1);
        System.out.println("\nОтсортированный массив:");
        array.print();
    }
}
