package exceptionsTest;

import static arithmetic.Arithmetic.division;
import exceptions.OperationException;

public class TestExceptions {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = division(10, 0);
        } catch (OperationException e) {
            System.out.println("An OperationException occurred");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An Exception occurred (Runtime):");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Division by zero was checked");
        }
        System.out.println("result = " + result);
    }
}