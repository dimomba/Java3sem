package task10x3;

import java.util.LinkedList;

public class BubbleSort1 {
    LinkedList<Student> array1;
    LinkedList<Student> array2;
    LinkedList<Student> array;

    public BubbleSort1(LinkedList<Student> array1, LinkedList<Student> array2)
    {
        this.array1 = array1;
        this.array2 = array2;
        array = new LinkedList<Student>();
    }

    public void arrayMaker1()
    {
        for (int i = 0; i < array1.size(); i++)
            array.add(array1.get(i));
        for (int i = 0; i < array2.size(); i++)
            array.add(array2.get(i));
    }

    public LinkedList<Student> getArray1() {
        return array;
    }

    private void swap1(LinkedList<Student> array, int ind1, int ind2) {
        Student tmp = array.get(ind1);
        array.set(ind1, array.get(ind2));
        array.set(ind2, tmp);
    }

    public void SortBubble1() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i).getScore() > array.get(i - 1).getScore()) {
                    swap1(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }
    public void print1()
    {
        for (int i = 0; i < array.size(); i++)
            System.out.println(array.get(i));
    }
}
