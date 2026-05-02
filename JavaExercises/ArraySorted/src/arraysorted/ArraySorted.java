package arraysorted;

import java.util.Scanner;

public class ArraySorted {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[8];

            System.out.println("Enter 8 numbers to find the maximum and minimum: ");
            for (int i = 0; i < 8; i++) {
                numbers[i] = scanner.nextInt();
            }

            int max = numbers[0];
            int min = numbers[0];

            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
    }
}
