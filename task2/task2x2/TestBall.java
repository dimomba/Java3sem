package task2x2;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        double x, y;
        Ball b1 = new Ball(8.0, 3.5);
        System.out.println(b1.toString());
        Scanner source = new Scanner(System.in);
        System.out.print("Введите x ");
        x = source.nextDouble();
        b1.setX(x);
        System.out.print("Введите y ");
        y = source.nextDouble();
        b1.setY(y);
        //b1.setXY(x, y);
        System.out.print(b1.toString());
    }
}
