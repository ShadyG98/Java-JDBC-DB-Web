package finalKeyword;

public class TestFinal {
    public static void main(String[] args) {
        final int myVariable = 10;
        System.out.println("myVariable = " + myVariable);

        final Person person1 = new Person();
        person1.setName("John");
        System.out.println("person1 name: " + person1.getName());
        person1.setName("Carlos");
        System.out.println("person1 name: " + person1.getName());
    }
}