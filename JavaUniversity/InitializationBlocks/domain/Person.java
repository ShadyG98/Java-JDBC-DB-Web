package initializationBlocks;

public class Person {
    private final int personId;
    private static int peopleCounter;

    static {
        System.out.println("Static block execution");
        ++Person.peopleCounter;
    }

    {
        System.out.println("Non-static block execution");
        this.personId = Person.peopleCounter++;
    }

    public Person() {
        System.out.println("Constructor execution");
    }

    public int getPersonId() {
        return personId;
    }

    @Override
    public String toString() {
        return "Person{" + "personId=" + personId + '}';
    }

}