package task18x8;

import java.util.Scanner;

public class Exception8 {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);

        while(true) {
            try {
                String key = myScanner.nextLine();
                printDetails(key);
                return;
            }
            catch (Exception e) {
                System.out.println("Try again");
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception ex) {
            throw ex;
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals(""))
            throw new Exception("Key set to empty string");
        else
            return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}
