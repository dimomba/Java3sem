package task2x10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = source.nextLine();
        int cnt = 0;
        if(s.charAt(0) != ' ')
            cnt++;
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i - 1) == ' ' && s.charAt(i) != ' ')
                cnt++;
        }
        System.out.println("Количество слов: " + cnt);
    }
}
