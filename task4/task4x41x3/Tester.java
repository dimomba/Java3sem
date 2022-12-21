package task4x41x3;

public class Tester {
    public static void main(String[] args) {
        Person[] arr = new Person[2];
        arr[0] = new Person("Иванов Иван Иванович", 25);
        arr[1] = new Person();
        arr[1].setFullName("Петров Петр Петрович");
        arr[1].setAge(31);
        arr[1].talk();
        for(int i = 0; i < 2; i++)
            System.out.println((i+1) + ". " + arr[i]);
    }
}
