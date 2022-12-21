package task22x1;

import java.util.Stack;

public class Calculator {
    public static double fromPolandToNormal(String stPolandInput) throws EmptyStackException, DivisionByZeroException {
        Double result = 0.0;
        String currentPosition = "";
        Stack<Double> currentStack = new Stack();

        for(int i = 0; i < stPolandInput.length(); ++i) {
            if (isOperand(Character.valueOf(stPolandInput.charAt(i)).toString())) {
                if (currentStack.size() < 2) {
                    throw new EmptyStackException();
                }

                result = operationResult((Double)currentStack.pop(), (Double)currentStack.pop(), Character.valueOf(stPolandInput.charAt(i)).toString());
                currentStack.push(result);
            } else if (stPolandInput.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")) {
                currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                currentPosition = "";
            } else {
                currentPosition = currentPosition + stPolandInput.charAt(i);
            }
        }

        return currentStack.empty() ? 0.0 : (Double)currentStack.pop();
    }

    public static boolean isOperand(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static Double operationResult(Double firstNum, Double secondNum, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && firstNum == 0.0) {
            throw new DivisionByZeroException();
        } else {
            switch (operand) {
                case "+":
                    return firstNum + secondNum;
                case "-":
                    return secondNum - firstNum;
                case "*":
                    return firstNum * secondNum;
                case "/":
                    return secondNum / firstNum;
                default:
                    return 0.0;
            }
        }
    }

    public static void main(String[] args) throws EmptyStackException {
        try {
            System.out.println(fromPolandToNormal("9 14 +"));
            System.out.println(fromPolandToNormal("20 9 * 9 7 * +"));
            System.out.println(fromPolandToNormal("111 32 86 7 3 * + - /"));
            System.out.println(fromPolandToNormal("8 0 /"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}