package matrices;

public class TestMatrices {
    public static void main(String[] args) {
        int[][] ages = new int[3][2];
        System.out.println("ages = " + ages);

        ages[0][0] = 5;
        ages[0][1] = 7;
        ages[1][0] = 8;
        ages[1][1] = 4;

        System.out.println("ages 0-0 = " + ages[0][0]);
        System.out.println("ages 0-1 = " + ages[0][1]);

        for (int row = 0; row < ages.length; row++) {
            for (int col = 0; col < ages[row].length; col++) {
                System.out.println("ages " + row + "-" + col + ": " + ages[row][col]);
            }
        }

        String[][] fruits = {{"Orange", "Lemon"}, {"Strawberry", "Blackberry", "Blueberry"}};
        print(fruits);

        Person[][] people = new Person[2][3];
        people[0][0] = new Person("John");
        people[0][1] = new Person("Karla");
        print(people);
    }

    public static void print(Object[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("matrix " + row + "-" + col + ": " + matrix[row][col]);
            }
        }
    }
}