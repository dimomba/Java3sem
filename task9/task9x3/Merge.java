package task9x3;

public class Merge {
    Student array1[];
    Student array2[];
    Student[] array;

    public Merge(Student[] array1, Student[] array2)
    {
        this.array1 = array1;
        this.array2 = array2;
        array = new Student[array1.length + array2.length];
    }

    public void arrayMaker()
    {
        for (int i = 0; i < array1.length; i++)
            array[i] = array1[i];
        for (int i = array1.length; i < array.length; i++)
            array[i] = array2[i- array1.length];
    }

    public Student[] getArray() {
        return array;
    }

    public void mergeSort(Student[] array, int left, int right)
    {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1))
        {
            mergeSort(array, left, delimiter - 1);
            mergeSort(array, delimiter, right);
        }

        Student[] buffer = new Student[right - left + 1];

        int cursor = left;
        for (int i = 0; i < buffer.length; i++)
        {
            if (delimiter > right || array[cursor].getScore() > array[delimiter].getScore())
            {
                buffer[i] = array[cursor];
                cursor++;
            }
            else
            {
                buffer[i] = array[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, array, left, buffer.length);
    }

    public void print()
    {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
