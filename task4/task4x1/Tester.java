package task4x1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        TimesOfYear MyFavourite = TimesOfYear.SUMMER;
        System.out.println("Информация о любимом времени года:\n" + MyFavourite);
        System.out.print("------------------\nВведите время года: ");
        Scanner sc = new Scanner(System.in);
        String ILike = sc.next();
        switch (ILike) {
            case "WINTER":
                TimesOfYear a = TimesOfYear.WINTER;
                System.out.println("I like " + a.ILike());
                break;
            case "SPRING":
                TimesOfYear b = TimesOfYear.SPRING;
                System.out.println("I like " + b.ILike());
                break;
            case "SUMMER":
                TimesOfYear c = TimesOfYear.SUMMER;
                System.out.println("I like " + c.ILike());
                break;
            case "AUTUMN":
                TimesOfYear d = TimesOfYear.AUTUMN;
                System.out.println("I like " + d.ILike());
                break;
        }
        System.out.println("------------------\n" + MyFavourite.name() + ": " + MyFavourite.getDescription() + "\n------------------");
        for (TimesOfYear time: TimesOfYear.values())
        {
            System.out.println(time);
        }
    }
}
