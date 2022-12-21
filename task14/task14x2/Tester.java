package task14x2;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = sc.nextLine();
        if (Pattern.matches("abcdefghijklmnopqrstuv18340", string))
            System.out.println("Введенная строка является строкой \"abcdefghijklmnopqrstuv18340\"");
        else
            System.out.println("Введенная строка не является строкой \"abcdefghijklmnopqrstuv18340\"");
    }
}
