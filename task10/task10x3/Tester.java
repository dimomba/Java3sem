package task10x3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество студентов в первом списке:");
        int cnt1 = sc.nextInt();
        System.out.println("Введите количество студентов во втором списке:");
        int cnt2 = sc.nextInt();


        long startTime = System.currentTimeMillis();

        ArrayList<Student> array1 = new ArrayList<Student>();
        ArrayList<Student> array2 = new ArrayList<Student>();

        for (int i = 0; i < cnt1; i++)
            array1.add(new Student("Student", "" + (i+1), 3000 + (i * 53) % ((i + 1) * 3), (i * 7) % 5 + 1, 1016 + i, ((i + 6) * 11 + i % 3) % 101));
        for (int i = 0; i < cnt2; i++)
            array2.add(new Student("Student", "" + (i+1+cnt1), 3000 + ((i+cnt1) * 53) % (((i+cnt1) + 1) * 3), ((i+cnt1) * 7) % 5 + 1, 1016 + (i+cnt1), (((i+cnt1) + 6) * 11 + (i+cnt1) % 3) % 101));
        BubbleSort array = new BubbleSort(array1, array2);
        array.arrayMaker();

        System.out.println("Объединенные два списка изначально:");
        array.print();

        array.SortBubble();

        System.out.println("\nОтсортированные объединенные два списка:");
        array.print();
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время на ArrayList: " + estimatedTime + " ms");

        System.out.println("\n\n\n\n\n\n\n");

        System.out.println("Введите количество студентов в первом списке:");
        int cnt11 = sc.nextInt();
        System.out.println("Введите количество студентов во втором списке:");
        int cnt21 = sc.nextInt();


        startTime = System.currentTimeMillis();

        LinkedList<Student> array11 = new LinkedList<Student>();
        LinkedList<Student> array21 = new LinkedList<Student>();

        for (int i = 0; i < cnt11; i++)
            array11.add(new Student("Student", "" + (i+1), 3000 + (i * 53) % ((i + 1) * 3), (i * 7) % 5 + 1, 1016 + i, ((i + 6) * 11 + i % 3) % 101));
        for (int i = 0; i < cnt21; i++)
            array21.add(new Student("Student", "" + (i+1+cnt11), 3000 + ((i+cnt11) * 53) % (((i+cnt11) + 1) * 3), ((i+cnt11) * 7) % 5 + 1, 1016 + (i+cnt11), (((i+cnt11) + 6) * 11 + (i+cnt11) % 3) % 101));
        BubbleSort1 array0 = new BubbleSort1(array11, array21);
        array0.arrayMaker1();

        System.out.println("Объединенные два списка изначально:");
        array0.print1();

        array0.SortBubble1();

        System.out.println("\nОтсортированные объединенные два списка:");
        array0.print1();
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время на LinkedList: " + estimatedTime + " ms");
    }
}
