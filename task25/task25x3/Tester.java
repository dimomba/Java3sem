package task25x3;

import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        System.out.println("192.168.1.1 " + (checkIP("192.168.1.1") ? "is IPv4" : "is not IPv4"));
        System.out.println("256.56.0.0 " + (checkIP("256.56.0.0") ? "is IPv4" : "is not IPv4"));
        System.out.println("255.53.89.23 " + (checkIP("255.53.89.23") ? "is IPv4" : "is not IPv4"));
        System.out.println("255.4.1000.78 " + (checkIP("255.4.1000.78") ? "is IPv4" : "is not IPv4"));
        System.out.println("255.53.qqq.23 " + (checkIP("255.53.qqq.23") ? "is IPv4" : "is not IPv4"));
    }

    public static Boolean checkIP(String stIP) {
        String regex = "^(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])))$";
        return Pattern.matches(regex, stIP);
    }
}