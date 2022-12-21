package task18x3;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }

        catch (Exception ex) {
            System.out.println("General exception");
        }

    }
}