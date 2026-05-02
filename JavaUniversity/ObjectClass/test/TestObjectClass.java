package objectClass;

public class TestObjectClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("juan", 5000);
        Employee employee2 = new Employee("Juan", 5000);

        if (employee1 == employee2) {
            System.out.println("Same memory reference");
        } else {
            System.out.println("Different memory references");
        }

        if (employee1.equals(employee2)) {
            System.out.println("Objects are equal in content");
        } else {
            System.out.println("Objects are different in content");
        }

        if (employee1.hashCode() == employee2.hashCode()) {
            System.out.println("hashcode value is equal");
        } else {
            System.out.println("hashcode value is different");
        }

    }
}