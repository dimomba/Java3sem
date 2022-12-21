package task4x3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Clothes[] arr = new Clothes[4];
        arr[0] = new TShirt(Size.M, 999, "White");
        arr[1] = new Pants(Size.L, 1599, "Black");
        arr[2] = new Skirt(Size.S, 1899, "Blue");
        arr[3] = new Tie(Size.M, 699, "Red");
        Shoes[] mas = new Shoes[2];
        mas[0] = new Sneakers(SizeForShoe.US8, 999, "White");
        mas[1] = new Boots(SizeForShoe.US9, 1599, "Black");
        int sm = 0;
        String login, passwd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        login = sc.next();
        System.out.print("Введите пароль: ");
        passwd = sc.next();
        boolean flag = true;
        while (flag)
        {
            System.out.println("Что вы желаете приобрести?\n1. Одежда\n2. Обувь");
            int level1 = sc.nextInt();
            switch (level1) {
                case 1:
                    System.out.println("1. Мужская одежда\n2. Женская одежда");
                    int level2 = sc.nextInt();
                    switch (level2) {
                        case 1:
                            System.out.println("Чтобы добавить товар в корзину, введите его номер");
                            System.out.println("1. " + arr[0] + "\n2. " + arr[1] + "\n3. " + arr[3]);
                            int level3 = sc.nextInt();
                            switch (level3) {
                                case 1:
                                    sm += arr[0].getCost();
                                    break;
                                case 2:
                                    sm += arr[1].getCost();
                                    break;
                                case 3:
                                    sm += arr[3].getCost();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Чтобы добавить товар в корзину, введите его номер");
                            System.out.println("1. " + arr[0] + "\n2. " + arr[2]);
                            int level4 = sc.nextInt();
                            switch (level4) {
                                case 1:
                                    sm += arr[0].getCost();
                                    break;
                                case 2:
                                    sm += arr[2].getCost();
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Чтобы добавить товар в корзину, введите его номер");
                    System.out.println("1. " + mas[0] + "\n2. " + mas[1]);
                    int level3 = sc.nextInt();
                    switch (level3) {
                        case 1:
                            sm += mas[0].getCost();
                            break;
                        case 2:
                            sm += mas[1].getCost();
                            break;
                    }
                    break;
            }
            System.out.println("Товар добавлен в корзину.\n1. Продолжить покупки\n2. Вывести сумму покупки");
            int level4 = sc.nextInt();
            switch (level4) {
                case 1:
                    flag = true;
                    break;
                case 2:
                    System.out.print("Сумма покупки: " + sm + "₽");
                    flag = false;
                    break;
            }
        }
    }
}
