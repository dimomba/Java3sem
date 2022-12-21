package task2x4;
import java.util.Scanner;

public class Shop {
    private int len;

    private String[] arr;
    public Shop()
    {
        System.out.println("Введите количество компьютеров");
        Scanner sc = new Scanner(System.in);
        this.len = sc.nextInt();
        arr = new String[this.len];
        for(int i = 0; i < len; i++)
        {
            Scanner source = new Scanner(System.in);
            //System.out.println("Введите x ");
            arr[i] = source.next();
        }
    }

    public void print() {
        for(int i = 0; i < len; i++)
            System.out.println(arr[i]);
    }

    public void addPC()
    {
        this.len++;
        String[] newArr = new String[len];
        for(int i = 0; i < len - 1; i++)
        {
            newArr[i] = arr[i];
        }
        System.out.println("Введите название нового компьютера");
        Scanner source = new Scanner(System.in);
        newArr[len - 1] = source.next();
        arr = newArr;
    }

    public void deletePC()
    {
        System.out.println("Введите название удаляемого компьютера");
        Scanner source = new Scanner(System.in);
        String PC = source.next();
        String[] newArr = new String[len];
        int k = 0;
        for(int i = 0; i < len; i++)
        {
            if (arr[i].equals(PC))
                k += 1;
            else
                newArr[i - k] = arr[i];
        }
        arr = newArr;
        this.len -= k;
    }

    public void searchPC()
    {
        System.out.println("Введите название искомого компьютера");
        Scanner source = new Scanner(System.in);
        String PC = source.next();
        boolean k = false;
        for(int i = 0; i < len; i++)
        {
            if (arr[i].equals(PC)) {
                System.out.println("Искомый компьютер находится в списке под номером " + (i + 1));
                k = true;
                break;
            }
        }
        if (!k)
            System.out.println("Данного компьютера нет в наличии");
    }
}
