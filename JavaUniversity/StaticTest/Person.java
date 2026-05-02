package staticTest;

public class Person {
    private static int counter = 0;
    private int id;
    private String name;

    public Person() {
        this.id = ++Person.counter;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name=" + name + '}';
    }
}