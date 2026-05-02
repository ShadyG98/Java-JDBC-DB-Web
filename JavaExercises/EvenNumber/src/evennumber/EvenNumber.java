package evennumber;

public class EvenNumber {

    public static void main(String[] args) {
        int number = 1;
        System.out.println("Even numbers with While: ");
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println("Even numbers with Do while: ");
        int count = 1;
        do {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        } while (count <= 100);

        System.out.println("Even numbers with For: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
