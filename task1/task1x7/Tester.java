package task1x7;

public class Tester {
    public static int f (int a){
        int f = a;
        int i = 1;
        while ((a - i) > 0) {
            f = f * (a - i);
            i++;
        }
        return f;
    }
    public static void main(String[] args) {
        int f = f(5);
        System.out.println(f);
    }
}