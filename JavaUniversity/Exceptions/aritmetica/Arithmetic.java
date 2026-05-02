package arithmetic;

import exceptions.OperationException;

public class Arithmetic {
    public static int division(int numerator, int denominator) {
        if (denominator == 0) {
            throw new OperationException("Division by zero");
        }
        return numerator / denominator;
    }
}