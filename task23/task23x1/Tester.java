package task23x1;

public class Tester {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        fill(queue, 5);
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

    public static void fill(ArrayQueue queue, int size) {
        for(int i = 0; i < size; ++i) {
            queue.enqueue(i);
        }
    }
}