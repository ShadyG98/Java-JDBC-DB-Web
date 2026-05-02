package finalKeyword;

public final class Person {
    public static final int CONSTANT = 1;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void print() {
        System.out.println("Print method");
    }
}