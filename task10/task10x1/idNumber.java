package task10x1;

public class idNumber {
    Student[] array;

    public idNumber(int count) {
        array = new Student[count];
        for (int i = 0; i < count; i++)
            array[i] = new Student("Student", "" + (i+1), 3000 + (i * 53) % ((i + 1) * 3), (i * 7) % 5 + 1, 1016 + i, ((i + 6) * 11 + i % 3) % 101);
    }

    public Student[] getArray() {
        return array;
    }

    public void quickSort(Student[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student center = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker].getScore() > center.getScore())
                leftMarker++;

            while (array[rightMarker].getScore() < center.getScore())
                rightMarker--;

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder)
            quickSort(array, leftMarker, rightBorder);

        if (leftBorder < rightMarker)
            quickSort(array, leftBorder, rightMarker);
    }

    public void quickSortWithCourse(Student[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student center = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker].getCourse() > center.getCourse())
                leftMarker++;

            while (array[rightMarker].getCourse() < center.getCourse())
                rightMarker--;

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder)
            quickSort(array, leftMarker, rightBorder);

        if (leftBorder < rightMarker)
            quickSort(array, leftBorder, rightMarker);
    }

    public void mergeSort(Student[] array, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(array, left, delimiter - 1);
            mergeSort(array, delimiter, right);
        }

        Student[] buffer = new Student[right - left + 1];

        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || array[cursor].getScore() > array[delimiter].getScore()) {
                buffer[i] = array[cursor];
                cursor++;
            } else {
                buffer[i] = array[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, array, left, buffer.length);
    }

    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}