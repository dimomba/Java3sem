package task8;

import java.util.Scanner;

public class Tester17 {
    public static int recursion() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return Math.max(n, recursion());
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите последовательность натуральных чисел:");
        System.out.println("Максимум считанной последовательности: " + recursion());
    }
}
