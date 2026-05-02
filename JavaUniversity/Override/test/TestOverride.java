package overrideTest;

public class TestOverride {
    public static void main(String[] args) {
        Manager manager1 = new Manager("John", 5000, "Systems");
        System.out.println("manager1 = " + manager1.getDetails());
    }
}