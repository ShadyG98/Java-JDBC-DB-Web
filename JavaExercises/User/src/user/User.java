package user;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        int password = 123;
        int attempts = 0;
        int maxAttempts = 3;

        System.out.println("Welcome to the system:\nEnter your username and password ");
        String inputUsername = scanner.nextLine();
        int inputPassword = Integer.parseInt(scanner.nextLine());

        while (!inputUsername.equals(username) || inputPassword != password) {
            attempts++;
            if (attempts >= maxAttempts) {
                System.out.println("User blocked");
                return;
            }
            System.out.println("Incorrect password " + (maxAttempts - attempts) + " attempts remaining ");
            inputUsername = scanner.nextLine();
            inputPassword = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Welcome, administrator");
    }
}
