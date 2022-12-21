package task14x3;

import java.util.regex.*;

public class Tester {
    public static void main(String[] args) {
        String text = "80.384 RUB 34 EU 25.90 28.98 EY 0.01 USD 80000 EU";
        Pattern pattern = Pattern.compile("([^\\d\\.])([0-9]\\d*(?:.\\d{1,2})?\\s*(?:USD|RUB|EU))\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start() + 1, matcher.end()));
        }
    }
}