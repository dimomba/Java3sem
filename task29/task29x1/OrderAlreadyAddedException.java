package task29x1;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String adress) {
        super("Заказ по адресу " + adress + " уже существует");
    }
}