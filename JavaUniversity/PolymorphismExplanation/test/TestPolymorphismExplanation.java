package polymorphismExplanation;

public class TestPolymorphismExplanation {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 5000);
        print(employee);

        employee = new Manager("Karla", 10000, "Accounting");
        print(employee);
    }

    public static void print(Employee employee) {
        String details = employee.getDetails();
        System.out.println("employee = " + details);
    }
}