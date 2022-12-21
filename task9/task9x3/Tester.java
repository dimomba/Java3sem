package task9x3;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество студентов в первом списке:");
        int cnt1 = sc.nextInt();
        System.out.println("Введите количество студентов во втором списке:");
        int cnt2 = sc.nextInt();

        Student[] array1 = new Student[cnt1];
        Student[] array2 = new Student[cnt2];

        for (int i = 0; i < cnt1; i++)
            array1[i] = new Student((int)(Math.random() * 101), "Student " + (i+1));

        for (int i = 0; i < cnt2; i++)
            array2[i] = new Student((int)(Math.random() * 101), "Student " + (i+1+cnt1));

        Merge array = new Merge(array1, array2);
        array.arrayMaker();

        System.out.println("Объединенные два списка изначально:");
        array.print();

        array.mergeSort(array.getArray(), 0 , cnt1 + cnt2 - 1);

        System.out.println("\nОтсортированные объединенные два списка:");
        array.print();
    }
}
