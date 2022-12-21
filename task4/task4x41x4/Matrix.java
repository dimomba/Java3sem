package task4x41x4;

public class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int[][] data) {
        this.data = data.clone();
        rows = this.data.length;
        cols = this.data[0].length;
    }
    public Matrix(int rows, int cols) {
        data = new int[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }
    public void display() {
        System.out.print("[");
        for (int row = 0; row < rows; ++row) {
            if (row != 0) {
                System.out.print(" ");
            }
            System.out.print("[");
            for (int col = 0; col < cols; ++col) {
                System.out.printf("%-2s", data[row][col]);
                if (col != cols - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("]");
            if (row == rows - 1) {
                System.out.print("]");
            }
            System.out.println();
        }
    }
    public Matrix sum(Matrix matrix) {
        Matrix res = new Matrix(rows, cols);
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < cols; j++) {
                res.data[i][j] = this.data[i][j] + matrix.data[i][j];
            }
        }
        return res;
    }
    public Matrix mult(int n) {
        Matrix res = new Matrix(rows, cols);
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < cols; j++) {
                res.data[i][j] = this.data[i][j] * n;
            }
        }
        return res;
    }
}
