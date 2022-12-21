package task4x2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        Clothes[] arr = new Clothes[4];
        arr[0] = new TShirt(Size.M, 999, "White");
        arr[1] = new Pants(Size.L, 1599, "Black");
        arr[2] = new Skirt(Size.S, 1899, "Blue");
        arr[3] = new Tie(Size.M, 699, "Red");
        //dressWomen
        System.out.println("Женская одежда:\n" + arr[0] + "\n" + arr[2]);
        //dressMen
        System.out.println("Мужская одежда:\n" + arr[0] + "\n" + arr[1] + "\n" + arr[3]);
    }
}
