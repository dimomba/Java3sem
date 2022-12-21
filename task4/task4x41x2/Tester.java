package task4x41x2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        arr[0] = new Phone("88002154789", "Apple", 153);
        arr[1] = new Phone("88006878250", "Samsung", 164);
        arr[2] = new Phone("88009942305", "Xiaomi", 170);
        for(int i = 0; i < 3; i++)
            System.out.println(arr[i]);
        arr[0].receiveCall("Олег Григорьев");
        arr[0].receiveCall("Олег Григорьев", "88006543218");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номера телефонов, которым будет отправлено сообщение. Чтобы закончить ввод номеров, введите send");
        String s = sc.nextLine();
        arr[0].sendMessage(s);
    }
}
