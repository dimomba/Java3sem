package task14x4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tester {
    public static void main(String[] args) {
        String text = "(1  + 8) – 9 / 4 + ";
        String regex = "[0-9]+[ ]*[+]";

        System.out.print("Строка без цифр, после которых стоит '+': ");
        String [] s = text.split(regex);
        for(int i = 0; i < s.length; i++)
            System.out.print(s[i]);
    }
}
