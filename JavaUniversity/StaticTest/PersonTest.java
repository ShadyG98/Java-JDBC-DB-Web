package staticTest;

public class PersonTest {
    private int counter;

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Karla");

        print(person1);
        print(person2);
    }

    public static void print(Person person) {
        System.out.println("person = " + person);
    }

    public int getCounter() {
        print(new Person("Carlos"));
        return counter;
    }
}