package task23x2;

public class Tester {
    public static void main(String[] args) {
        AbstractQueue queue = new LinkedQueue();
        fill(5, queue);
        System.out.println(queue.show());
        //System.out.println("Первый элемент очереди: " + queue.element());

        System.out.println("Текущий размер очереди: " + queue.size());
        System.out.println("Первый элемент очереди: " + queue.dequeue());
        System.out.println("\nОчередь после удаления из нее первого элемента: " + queue.show());

        System.out.println("Текущий размер очереди: " + queue.size());
        System.out.println("Пустая ли очередь: " + queue.isEmpty());

        queue.clear();
        System.out.println("\nОчередь после удаления из нее всех элементов: " + queue.show());
        System.out.println("Пустая ли очередь: " + queue.isEmpty());
    }

    public static void fill(int size, AbstractQueue queue) {
        for (int i = 0; i < size; ++i) {
            queue.enqueue(i);
        }
    }
}
