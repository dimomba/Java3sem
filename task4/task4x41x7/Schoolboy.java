package task4x41x7;

public class Schoolboy extends Learner {
    private String grade;
    public Schoolboy(String firstName, String lastName, int age, String grade) {
        super(firstName, lastName, age);
        this.grade = grade;
    }
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", возраст: " + this.getAge() + ", класс: " + grade;
    }
    public String getClasss() {
        return "Schoolboy";
    }
}
