package task4x41x10;

public class Tester {
    public static void main(String[] args) {
        Transport[] arr = new Transport[4];
        arr[0] = new Car("Car" , 90);
        arr[1] = new Plane("Plane", 700);
        arr[2] = new Train("Train", 70);
        arr[3] = new Ship("Ship", 30);
        for(int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}
