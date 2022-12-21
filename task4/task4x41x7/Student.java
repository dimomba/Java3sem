package task4x41x7;

public class Student extends Learner {
    private String group;
    public Student(String firstName, String lastName, int age, String group) {
        super(firstName, lastName, age);
        this.group = group;
    }
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", возраст: " + this.getAge() + ", группа: " + group;
    }
    public String getClasss() {
        return "Student";
    }
}
