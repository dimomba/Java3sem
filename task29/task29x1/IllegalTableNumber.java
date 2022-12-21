package task29x1;

public class IllegalTableNumber extends Error {
    public IllegalTableNumber(String adress) {
        super("Заказ за столик " + adress + " уже существует");
    }
}