package task4x41x1;

public class Tester {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(2.5);
        arr[1] = new Rectangle(1.5, 6);
        arr[2] = new Square(5.2);
        for(int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
