package task1x3;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int[] b = new int[10];
        System.out.println("Введите 10 элементов массива");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
            sum = sum + b[i];
        }
        System.out.println("Сумма чисел массива: ");
        System.out.println(sum);
        System.out.println("Среднее значение чисел массива: ");
        System.out.println(sum/b.length);
    }
}