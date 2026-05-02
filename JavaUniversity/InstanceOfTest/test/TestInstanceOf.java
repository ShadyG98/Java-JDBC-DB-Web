package instanceOfTest;

public class TestInstanceOf {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 5000);
        determineType(employee);
        employee = new Manager("Karla", 10000, "Accounting");
        determineType(employee);
    }

    public static void determineType(Employee employee) {
        if (employee instanceof Manager) {
            System.out.println("Is of type Manager");
            Manager manager = (Manager) employee;
            System.out.println("manager department = " + manager.getDepartment());
        } else if (employee instanceof Employee) {
            System.out.println("Is of type Employee");
            System.out.println("employee = " + employee.getName());
        } else if (employee instanceof Object) {
            System.out.println("Is of type Object");
            employee.toString();
        }
    }
}