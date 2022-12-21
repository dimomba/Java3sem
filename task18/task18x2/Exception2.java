package task18x2;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (NumberFormatException e) {
            System.out.println("not an integer");
        }
        catch (ArithmeticException ex) {
            System.out.println("Attempted division by zero");
        }

    }
}
