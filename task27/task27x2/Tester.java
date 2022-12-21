package task27x2;

public class Tester {
    public static void main(String[] args) {
        Map m = new Map();
        m.add("Иван", "Иванов");
        m.add("Олег", "Сидоров");
        m.add("Матвей", "Петров");
        m.add("Олег", "Алексеев");
        m.add("Иван", "Антонов");
        m.add("Алексей", "Матвеев");
        m.add("Александр", "Савельев");
        m.add("Иван", "Сидоров");
        m.add("Алексей", "Матвеев");
        m.add("Виталий", "Лисицын");

        System.out.println("Количество людей с одинаковым именем: " + m.getSameFirstNameCount());
        System.out.println("Количество людей с одинаковой фамилией: " + m.getSameLastNameCount());
    }
}
