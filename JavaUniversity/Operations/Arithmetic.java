package operations;

public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic() {
        System.out.println("Constructor:");
    }

    public Arithmetic(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        System.out.println("Constructor with arguments:");
    }

    public void sum() {
        System.out.println("Sum value: " + (a + b));
    }

    public int sumWithReturn() {
        return a + b;
    }

    public int sumWithArguments(int a, int b) {
        this.a = a;
        this.b = b;
        return sumWithReturn();
    }
}