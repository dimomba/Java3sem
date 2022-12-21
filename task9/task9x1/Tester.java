package task9x1;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Введите количество студентов:");
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        Student[] array = new Student[cnt];

        for (int i = 0; i < cnt; i++)   //заполнение массива
            array[i] =  new Student((int)(Math.random() * 1000) + 100, "Student " + (i+1));

        System.out.println("Изначальный массив:");
        for (int i = 0; i < cnt; i++)   //заполнение массива
            System.out.println(array[i]);

        for (int left = 0; left < array.length; left++)
        {
            Student value = array[left];
            int i = left - 1;
            for (; i >= 0; i--)
            {
                if (value.getId() < array[i].getId())
                    array[i + 1] = array[i];
                else
                    break;
            }
            array[i + 1] = value;
        }

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < cnt; i++)
            System.out.println(array[i]);
    }
}
