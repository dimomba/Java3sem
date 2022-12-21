package task2x6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 4, 5);
        System.out.println(c1);
        System.out.println(c1.Square());
        System.out.println(c1.Length());
        Circle c2 = new Circle(8, 5, 6);
        System.out.println(c2.toString());
        c1.Compare(c2);
    }
}
