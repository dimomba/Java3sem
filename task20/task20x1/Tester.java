package task20x1;

public class Tester {
    public static void main(String[] args) {
        Ob<Integer, String, AnimalExtended> obj = new Ob(100, "stroka", new AnimalExtended(5, "tmp", 10));
        obj.show();
    }
}
