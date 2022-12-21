package task23x1;

public class tQueue {
    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        fill(queue, 5);
        System.out.println(queue.show(queue));
        //System.out.println("Первый элемент очереди: " + queue.element());

        System.out.println("Текущий размер очереди: " + queue.size(queue));
        System.out.println("Первый элемент очереди: " + queue.dequeue(queue));
        System.out.println("\nОчередь после удаления из нее первого элемента: " + queue.show(queue));

        System.out.println("Текущий размер очереди: " + queue.size(queue));
        System.out.println("Пустая ли очередь: " + queue.isEmpty(queue));

        queue.clear(queue);
        System.out.println("\nОчередь после удаления из нее всех элементов: " + queue.show(queue));
        System.out.println("Пустая ли очередь: " + queue.isEmpty(queue));
    }

    public static void fill(ArrayQueueADT queue, int size) {
        for(int i = 0; i < size; ++i) {
            queue.enqueue(queue, i);
        }

    }
}
