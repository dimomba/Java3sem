package task18x5;

/*public class Exception5 {
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key;
    }
    public static void main(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
}*/
public class Exception5 {
    public static void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("data for " + key);
    }

    public static void main(String[] args) {
        try {
            getDetails(null);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
