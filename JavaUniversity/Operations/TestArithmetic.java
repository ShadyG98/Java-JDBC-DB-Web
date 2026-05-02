package operations;

public class TestArithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic1 = new Arithmetic();
        System.out.println("Default constructor called");

        Arithmetic arithmetic2 = new Arithmetic(5, 8);
        arithmetic2.sum();
        arithmetic2.sum();
    }
}