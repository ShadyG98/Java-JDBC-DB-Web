package polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 5000);
        print(employee);

        Manager manager = new Manager("Karla", 10000, "Accounting");
        print(manager);
    }

    public static void print(Employee employee) {
        System.out.println("employee = " + employee.getDetails());
    }
}