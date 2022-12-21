package task13x5;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        String number;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if ((s.charAt(0) == '+' && s.length() >= 12) || (s.charAt(0) == '8' && s.length() == 11))
        {
            String last4 = s.substring(s.length() - 4);
            s = s.substring(0, s.length() - 4);

            String second3 = s.substring(s.length() - 3);
            s = s.substring(0, s.length() - 3);

            String first3 = s.substring(s.length() - 3);
            s = s.substring(0, s.length() - 3);

            String codeOfCountry = "";

            if (s.charAt(0) == '+') {
                codeOfCountry = s.substring(1);
                number = "+" + codeOfCountry + " " + first3 + "-" + second3 + "-" + last4;
            }
            else if (s.charAt(0) == '8')
            {
                codeOfCountry = "7";
                number = "+" + codeOfCountry + " " + first3 + "-" + second3 + "-" + last4;
            }
            else
                number = s + " " + first3 + "-" + second3 + "-" + last4;

            System.out.println(number);
        }
        else
        {
            System.out.println("Некорректный ввод");
        }
    }
}