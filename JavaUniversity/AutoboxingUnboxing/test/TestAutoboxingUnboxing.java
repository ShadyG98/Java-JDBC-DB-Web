package autoboxingUnboxing;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        Integer integerVal = 10;
        System.out.println("integerVal = " + integerVal);
        System.out.println("integerVal double = " + integerVal.doubleValue());

        int intVal = integerVal;
        System.out.println("intVal = " + intVal);
    }
}