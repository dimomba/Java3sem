package task29x1;

import java.util.ArrayList;

public interface Order {
    boolean add(Item var1);

    boolean remove(String var1);

    int removeAll(String var1);

    int getCount();

    ArrayList getArray();

    int getCost();

    int getAmount(String var1);

    ArrayList getSortedArray();

    String[] getMenu();
}