package task4x41x8;


public class Tester {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle("red" , true, 2.5);
        arr[1] = new Rectangle("blue", false, 1.5, 6);
        arr[2] = new Square("green", true, 5.2);
        for(int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
