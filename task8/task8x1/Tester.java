package task8x1;

import java.util.Scanner;

public class Tester {
    public static void recursion(int cnt, int a, int n) {
        for(int i = 0; i < a; i++)
            if (cnt < n)
            {
                System.out.print(a + " ");
                cnt++;
            }
        if(cnt < n)
            recursion(cnt,a + 1, n);
    }
    public static void main(String[] args) {
        System.out.print("Введите натуральное число n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Последовательность: ");
        recursion(0, 1, n);
    }
}