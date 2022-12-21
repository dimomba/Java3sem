package task17x2;

public class Tester {
    public static void main(String[] args) {

        Employee model = retriveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        //update model data
        controller.setEmployeeName("Employee 2");
        System.out.println("After updating, Employee Details are as follows");
        controller.updateView();
    }
    private static Employee
    retriveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Employee 1");
        employee.setSalary(100000);
        return employee;
    }
}