package task4x41x4;

public class Tester {
    public static void main(String[] args) {
        int [][] arr1 = {{5, 7, 3}, {7, 0, 1}, {8, 1, 2}};
        Matrix matrix1 = new Matrix(arr1);
        System.out.println("Matrix A:");
        matrix1.display();
        int [][] arr2 = {{2, 4, 7}, {8, 2, 0}, {5, 9, 4}};
        Matrix matrix2 = new Matrix(arr2);
        System.out.println("Matrix B:");
        matrix2.display();
        System.out.println("Matrix A + B:");
        matrix1.sum(matrix2).display();
        System.out.println("Matrix A * 3:");
        matrix1.mult(3).display();
    }
}
