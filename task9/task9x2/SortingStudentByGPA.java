package task9x2;

class SortingStudentByGPA implements Comparator {
    Student[] array;

    public SortingStudentByGPA(int cnt)
    {
        array = new Student[cnt];
        for (int i = 0; i < cnt; i++)
        {
            array[i] = new Student((int)(Math.random() * 101), "Student " + (i+1));
        }
    }

    public Student[] getArray() {
        return array;
    }

    public void quickSort(Student[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student center = array[(leftMarker + rightMarker) / 2];
        do
        {
            while (array[leftMarker].getScore() > center.getScore())
                leftMarker++;

            while (array[rightMarker].getScore() < center.getScore())
                rightMarker--;

            if (leftMarker <= rightMarker)
            {
                if (leftMarker < rightMarker)
                {
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

    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
