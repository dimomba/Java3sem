package task2x3;
import java.util.Scanner;

public class TestPntCrcl {
    public static void main(String[] args) {
        double x, y, r;
        Point p1 = new Point(8.0, 3.5);
        /*System.out.println(p1.toString());
        Scanner source = new Scanner(System.in);
        System.out.print("Введите x ");
        x = source.nextDouble();
        p1.setX(x);
        System.out.print("Введите y ");
        y = source.nextDouble();
        p1.setY(y);
        //p1.setXY(x, y);
        System.out.print(p1.toString());*/
        int len = 3;
        Circle[] arr = new Circle[len];
        for (int i = 0; i < len; i++)
        {
            Scanner source = new Scanner(System.in);
            System.out.println("Введите x ");
            x = source.nextDouble();
            p1.setX(x);
            System.out.println("Введите y ");
            y = source.nextDouble();
            p1.setY(y);
            System.out.println("Введите r ");
            r = source.nextDouble();
            arr[i] = new Circle(p1, r);
            System.out.println(arr[i].toString());
        }
    }
}
