package arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] ages = new int[3];
        System.out.println("ages = " + ages);

        ages[0] = 10;
        System.out.println("ages 0 = " + ages[0]);

        for (int i = 0; i < ages.length; i++) {
            System.out.println("ages element " + i + ": " + ages[i]);
        }

        String[] fruits = {"Orange", "Banana", "Grape"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits = " + fruits[i]);
        }
    }
}