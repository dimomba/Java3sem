package task23x1;

public class tQueuemodule {
    public static void main(String[] args) {
        new ArrayQueueModule();
        fill(5);
        System.out.println(ArrayQueueModule.show());
        //System.out.println("Первый элемент очереди: " + queue.element());

        System.out.println("Текущий размер очереди: " + ArrayQueueModule.size());
        System.out.println("Первый элемент очереди: " + ArrayQueueModule.dequeue());
        System.out.println("\nОчередь после удаления из нее первого элемента: " + ArrayQueueModule.show());

        System.out.println("Текущий размер очереди: " + ArrayQueueModule.size());
        System.out.println("Пустая ли очередь: " + ArrayQueueModule.isEmpty());

        ArrayQueueModule.clear();
        System.out.println("\nОчередь после удаления из нее всех элементов: " + ArrayQueueModule.show());
        System.out.println("Пустая ли очередь: " + ArrayQueueModule.isEmpty());
    }

    public static void fill(int size) {
        for(int i = 0; i < size; ++i) {
            ArrayQueueModule.enqueue(i);
        }
    }
}
