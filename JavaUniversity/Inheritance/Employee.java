package inheritance;

public class Employee extends Person {
    private int employeeId;
    private double salary;
    private static int employeeCounter;

    public Employee() {
        this.employeeId = ++Employee.employeeCounter;
    }

    public Employee(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{employeeId=" + employeeId + ", salary=" + salary + ", " + super.toString() + "}";
    }
}