package task2x8;
import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int len = source.nextInt();
        String[] arr = new String[len];

        for(int i = 0; i < len; i++) //заполнение массива
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.next();
        }

        for(int i = 0; i < len / 2; i++) //"переворот" массива
        {
            String temp;
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
        for(int i = 0; i < len; i++) //вывод массива
            System.out.println(arr[i]);
    }
}
