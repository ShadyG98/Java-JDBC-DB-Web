package javaBeans;

public class TestJavaBeans {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setLastName("Smith");

        System.out.println("person = " + person);

        System.out.println("Person name:" + person.getName());
        System.out.println("Person lastName:" + person.getLastName());
    }
}