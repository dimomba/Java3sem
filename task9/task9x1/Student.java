package task9x1;

public class Student {
    int id;
    String name;

    public Student(int id, String name)
    {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return name + ", id: " + id;
    }
}
