package task4x41x3;

public class Person {
    private String fullName;
    private int age;
    public Person(){};
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void talk() {
        System.out.println(getFullName() + " говорит");
    }
    @Override
    public String toString() {
        return "Person {" + getFullName() + ", age: " + getAge() + " years}";
    }
}
