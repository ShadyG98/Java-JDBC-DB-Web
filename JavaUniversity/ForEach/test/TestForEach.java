package forEach;

public class TestForEach {
    public static void main(String[] args) {
        int[] ages = {5, 6, 8, 9};
        for (int age : ages) {
            System.out.println("age = " + age);
        }

        Person[] people = {new Person("John"), new Person("Karla"), new Person("Agustin")};
        for (Person person : people) {
            System.out.println("person = " + person);
        }
    }
}