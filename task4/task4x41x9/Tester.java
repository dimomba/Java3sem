package task4x41x9;

public class Tester {
    public static void main(String[] args) {
        Furniture[] arr = new Furniture[3];
        arr[0] = new Sofa("red" , "wood", 7000, "Sofa");
        arr[1] = new Chair("black", "ferrum", 2000, "Chair");
        arr[2] = new Table("green", "wood", 4000, "Table");
        for(int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
