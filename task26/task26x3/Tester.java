package task26x3;

public class Tester {
    public static void main(String[] args) {
        Table tab = new Table();
        tab.Table1();

        tab.add(54, "first");
        tab.add(3, "second");
        tab.add(31, "third");
        tab.add(128, "fourth");
        tab.add(508, "fivth");
        tab.add(993, "sixth");
        tab.add(31, "seventh");
        tab.add(5, "eighth");
        tab.add(88, "nineth");
        tab.add(26, "tenth");

        System.out.println("Хэш - таблица:");
        tab.show();

        System.out.println("\nРезультат поиска по ключу 88: " + tab.find(88));

        tab.delete(88);
        System.out.println("\nРезультат поиска по ключу 88 после удаления элемента с ключом 88: " + tab.find(88));

        ArrayQueue queue = new ArrayQueue();
        fill(queue, 10, tab);
        System.out.println("\n" + queue.show());
    }

    public static void fill(ArrayQueue queue, int size, Table tab) {
        for(int i = 0; i < size; i++) {
            if (tab.getI(i) != null)
                queue.enqueue(tab.getIvalue(i));
            else
                queue.enqueue("null");
        }
    }
}
