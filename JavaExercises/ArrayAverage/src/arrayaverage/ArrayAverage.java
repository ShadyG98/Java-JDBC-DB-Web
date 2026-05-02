package arrayaverage;

import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            int[] numbers = new int[5];

            System.out.println("Enter 5 numbers to calculate their average: ");
            for (int i = 0; i < 5; i++) {
                numbers[i] = scanner.nextInt();
            }

            for (int num : numbers) {
                sum += num;
            }
            double average = (double) sum / 5;

            System.out.println("The average is: " + average);
        }
    }
}
