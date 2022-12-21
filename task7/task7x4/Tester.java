package task7x4;

public class Tester {
    public static void main(String[] args) {
        MathCalculable calc = new MathFunc(10, "72 - 4*i");
        System.out.println(calc.degree(3));   //10^3
        System.out.println(calc.modComplex());  //модуль 72 - 4*i
        System.out.println(2 * calc.pi * calc.degree(1));
    }
}
