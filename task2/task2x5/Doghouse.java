package task2x5;

import java.util.Scanner;

public class Doghouse {
    public static void main(String[] args) {
        System.out.println("Введите количество собак");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        Dog[] dogs = new Dog[len];
        for(int i = 0; i < len; i++)
        {
            Scanner source = new Scanner(System.in);
            System.out.println("Введите кличку собаки");
            String name = source.next();
            System.out.println("Введите возраст собаки");
            int age = source.nextInt();
            dogs[i] = new Dog(name, age);
            System.out.println("Человеческий возраст:" + dogs[i].humanAge());
        }
        for(int i = 0; i < len; i++)
        {
            System.out.println(dogs[i].toString());
        }

    }
}
