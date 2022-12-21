package task18x6;

public class Exception6 {
    public static void printMessage(String key) {
        try {
            System.out.println(getDetails(key));
        }
        catch (Exception e) {
            System.out.println("key == null");
        }

    }
    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;

    }
    public static void main(String[] args) {
        printMessage(null);
    }
}
