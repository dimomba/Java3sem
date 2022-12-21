package task21x2;

public class Tester {
    public static <E> void sid(String s, E [] arr) {
        E [] a = arr;
        AnyClass <E> sid = new AnyClass <E> ();
        sid.setArr(a);
        System.out.print(s + "  ");
        for(int i = 0; i < sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");
        System.out.println();
    }

    public static void main(String [] args) {
        String [] s = { "task", "21", "x2" };
        sid("String" , s);

        Integer [] intr = { 35, 14, 5, 1, 155, 87, 48, 55};
        sid("Integer" , intr);

        Double [] ad = { 3.8, 55.2, 9.6 };
        sid("Double" , ad);
    }
}
