package task9x4;

public class BubbleSort implements Comparable{
    Student[] array;

    public BubbleSort(int cnt) {
        array = new Student[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = new Student((int) (Math.random() * 101), "Student " + (i + 1));
        }
    }

    public Student[] getArray() {
        return array;
    }

    private void swap(Student[] array, int ind1, int ind2) {
        Student tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void SortBubble() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].getScore() > array[i - 1].getScore()) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
