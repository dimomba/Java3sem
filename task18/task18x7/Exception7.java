package task18x7;

import java.util.Scanner;

public class Exception7 {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = myScanner.nextLine();
            printDetails(key);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void printDetails(String key) throws Exception {
        try {
            System.out.println(getDetails(key));
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
