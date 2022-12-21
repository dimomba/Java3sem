package task25x4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        System.out.println("(3*+*5)*–*9*×*4" + (ExpresionChecker("(3*+*5)*–*9*×*4") ? " is right" : " is not right"));
        System.out.println("((3*+*5)*–*9*×*4" + (ExpresionChecker("((3*+*5)*–*9*×*4") ? " is right" : " is not right"));
    }

    public static Boolean ExpresionChecker(String stExpression) {
        Matcher matcher;
        for(Pattern pattern = Pattern.compile("\\([^()]*\\)"); (matcher = pattern.matcher(stExpression)).find(); stExpression = matcher.replaceAll("")) {
        }

        return !stExpression.contains("(") && !stExpression.contains(")");
    }
}
