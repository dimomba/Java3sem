package task4x41x6;

public class Manager extends Employer {
    private double averageSum;
    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }
    public String getClasss() {
        return "Manager";
    }
    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", доход: " + this.getIncome();
    }
}