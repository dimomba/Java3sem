package task29x1;

import java.util.HashMap;

public class OrderManager {
    HashMap<Integer, Object> RestaurantOrders = new HashMap();
    HashMap<String, Object> InternetOrders = new HashMap();

    public OrderManager() {
    }

    public void add(Order order, int table) throws IllegalTableNumber {
        if (this.RestaurantOrders.containsKey(table)) {
            throw new IllegalTableNumber(Integer.toString(table));
        } else {
            this.RestaurantOrders.put(table, order);
        }
    }

    public void addPosition(Item item, int table) {
        if (this.RestaurantOrders.containsKey(table)) {
            Order order = (Order)this.RestaurantOrders.get(table);
            order.add(item);
            this.RestaurantOrders.replace(table, order);
        } else {
            throw new IllegalTableNumber(Integer.toString(table));
        }
    }

    public Object getOrder(int table) {
        return this.RestaurantOrders.get(table);
    }

    public void removeOrder(int table) {
        this.RestaurantOrders.remove(table);
    }

    public HashMap orders() {
        return this.RestaurantOrders;
    }

    public void add(Order order, String adress) throws OrderAlreadyAddedException {
        if (this.InternetOrders.containsKey(adress)) {
            throw new OrderAlreadyAddedException(adress);
        } else {
            this.InternetOrders.put(adress, order);
        }
    }

    public void addPosition(Item item, String adress) throws IllegalTableNumber {
        if (this.InternetOrders.containsKey(adress)) {
            Order order = (Order)this.InternetOrders.get(adress);
            order.add(item);
            this.InternetOrders.replace(adress, order);
        } else {
            throw new IllegalTableNumber(adress);
        }
    }

    public Object getOrder(String address) {
        return this.InternetOrders.get(address);
    }

    public void removeOrderInternet(String address) {
        this.InternetOrders.remove(address);
    }

    public HashMap getInternetOrder() {
        return this.InternetOrders;
    }
}
