package arrays;

public class TestObjectArrays {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Person("John");
        people[1] = new Person("Karla");

        System.out.println("people 0 = " + people[0]);
        System.out.println("people 1 = " + people[1]);

        for (int i = 0; i < people.length; i++) {
            System.out.println("people " + i + " = " + people[i]);
        }
    }
}