package task14x5;

import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        String date = "29/02/2000";
        String date2 = "30/04/2003";
        String date3 = "01/01/2003";
        String date4 = "29/02/2001";
        String date5 = "30-04-2003";
        String date6 = "1/1/1899";

        String regex = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

        System.out.println(date + ": " + Pattern.matches(regex, date));
        System.out.println(date2 + ": " + Pattern.matches(regex, date2));
        System.out.println(date3 + ": " + Pattern.matches(regex, date3));
        System.out.println(date4 + ": " + Pattern.matches(regex, date4));
        System.out.println(date5 + ": " + Pattern.matches(regex, date5));
        System.out.println(date6 + ": " + Pattern.matches(regex, date6));
    }
}
