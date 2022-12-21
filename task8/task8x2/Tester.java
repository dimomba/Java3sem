package task8x2;

import java.util.Scanner;

public class Tester {
    public static void recursion(int cnt, int n) {
        if (cnt - 1 < n)
        {
            System.out.print(cnt + " ");
            cnt++;
        }
        if(cnt - 1 < n)
            recursion(cnt, n);
    }
    public static void main(String[] args) {
        System.out.print("Введите натуральное число n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Числа от 1 до n: ");
        recursion(1, n);
    }
}
