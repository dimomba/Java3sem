package task14x1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = sc.nextLine();
        System.out.print("Введите подстроку или символ, по которому нужно разбить строку на элементы: ");
        String symbol = sc.nextLine();
        String[] s = string.split(symbol);
        for(int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
}
