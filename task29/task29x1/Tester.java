package task29x1;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Order restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new Dish(399, "Борщ", "Суп со свеклой"));
        restaurantOrder.add(new Dish(349, "Пельмени", "С соусом на выбор"));
        restaurantOrder.add(new Dish(419, "Цезарь", "Салат с курицей"));
        restaurantOrder.add(new Drink(119, "Вода", "AquaMinerale"));
        restaurantOrder.add(new Drink(189, "Cola", "Zero"));
        restaurantOrder.add(new Drink(159, "Чай", "Зеленый"));

        //выбрасывание исключения
        //restaurantOrder.add(new Drink(-1, "Чай", "Зеленый"));

        System.out.println("Меню: " + Arrays.toString(restaurantOrder.getMenu()) + "\n");


        OrderManager orderManager = new OrderManager();

        try {
            orderManager.add(restaurantOrder, 1);
        } catch (IllegalTableNumber var8) {
            System.out.println(var8.getMessage());
        }
        try {
            orderManager.add(restaurantOrder, 1);
        } catch (IllegalTableNumber var8) {
            System.out.println(var8.getMessage());
        }


        OrderManager orderManager1 = new OrderManager();
        Order internetOrder = new InternetOrder();
        internetOrder.add(new Dish(349, "Пельмени", "С соусом на выбор"));
        internetOrder.add(new Dish(419, "Цезарь", "Салат с курицей"));
        internetOrder.add(new Drink(119, "Вода", "AquaMinerale"));
        String address = "Проспект Вернадского 78";

        try {
            orderManager1.add(internetOrder, address);
        } catch (OrderAlreadyAddedException var7) {
            System.out.println(var7.getMessage());
        }
        try {
            orderManager1.add(internetOrder, address);
        } catch (OrderAlreadyAddedException var7) {
            System.out.println(var7.getMessage());
        }


        System.out.println("\nЗаказ: ");
        System.out.println(Arrays.toString(internetOrder.getMenu()));
    }
}
