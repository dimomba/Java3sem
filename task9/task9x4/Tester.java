package task9x4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Введите количество студентов:");
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        BubbleSort array = new BubbleSort(cnt);

        System.out.println("Изначальный массив:");
        array.print();

        array.SortBubble();
        System.out.println("\nОтсортированный массив:");
        array.print();
    }
}
