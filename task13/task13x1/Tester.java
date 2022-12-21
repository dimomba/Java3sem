package task13x1;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        int position = -1;

        System.out.println("Последний символ строки: " + s.charAt(s.length() - 1));

        if(s.endsWith("!!!"))
            System.out.println("Строка заканчивается на '!!!' ");
        else
            System.out.println("Строка не заканчивается на '!!!'");

        if(s.startsWith("I like"))
            System.out.println("Строка начинается с 'I like'");
        else
            System.out.println("Строка не начинается с 'I like'");

        if(s.contains("Java"))
            System.out.println("Строка содержит подстроку 'Java'");
        else
            System.out.println("Строка не содержит подстроку 'Java'");

        for (int i = 0; i < s.length() - 3; i++)
        {
            if(s.charAt(i) == 'J' & s.charAt(i + 1) == 'a' & s.charAt(i + 2) == 'v' & s.charAt(i + 3) == 'a')
            {
                System.out.println("Подстрока 'Java' начианается с позиции " + i);
                position = i;
                break;
            }
        }

        System.out.print("Строка с заменой символов 'a' на символы 'o': ");
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
                System.out.print('o');
            else
                System.out.print(s.charAt(i));
        }

        System.out.println("\nСтрока, преобразованная к верхнему регистру: " + s.toUpperCase());

        System.out.println("Строка, преобразованная к нижнему регистру: " + s.toLowerCase());

        if (position != -1)
            System.out.println("Строка с вырезанной подстрокой 'Java': " + s.substring(0, position) + s.substring(position + 4));
        else
            System.out.println("Строка изначально не содержит подстроку 'Java'");
    }
}