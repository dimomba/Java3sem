package task20x4;

public class Tester {
    public static void main(String[] args) {
        MinMax<Integer> tmp = new MinMax(new Integer[]{ 2, 80, 56, 11});
        System.out.println("Минимальный элемент: " + tmp.findMin());
        System.out.println("Максимальный элемент: " + tmp.findMax());

        System.out.println("Калькулятор:");
        System.out.println("3 + 6 = " + Calculator.sum(3, 6));
        System.out.println("14 - 9 = " + Calculator.subtraction(14, 9));
        System.out.println("6 * 8 = " + Calculator.multiply(6, 8));
        System.out.println("16 / 8 = " + Calculator.divide(16, 8));
    }
}
