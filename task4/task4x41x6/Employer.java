package task4x41x6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }
    public double getIncome() {
        return income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getClasss() {
        return "Employer";
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", доход: " + getIncome();
    }
}