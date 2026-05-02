package logic;

import database.*;
import java.util.*;

/**
 * Main application class for the Student Management System.
 * Provides a command-line interface for managing student records.
 */
public class MainTest {

    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        
        try {
            StudentManager studentManager = new StudentManager();

            // Add initial test students
            Student diego = new Student("Diego", "Silva", 40901951);
            studentManager.addStudent(diego);
            
            Student juan = new Student("Juan", "Lopez", 36125641);
            studentManager.addStudent(juan);
            
            Student monica = new Student("Monica", "Antich", 22372208);
            studentManager.addStudent(monica);
            
            Student ivan = new Student("Ivan", "Massimino", 41711400);
            studentManager.addStudent(ivan);
            
            Student brenda = new Student("Brenda", "Escobar", 41482506);
            studentManager.addStudent(brenda);

            // Test student for modification/delete operations
            Student testJuan = new Student("Juan", "Perez", 123);
            System.out.println("Added student: " + testJuan.getName() + 
                              " | Surname: " + testJuan.getSurname() + 
                              " | DNI: " + testJuan.getDni());
            studentManager.addStudent(testJuan);

            // Modify test student
            testJuan.setDni(456);
            testJuan.setId_student(6);
            System.out.println("Modified student with data: " + testJuan.getName() + 
                              " | Surname: " + testJuan.getSurname() + 
                              " | DNI: " + testJuan.getDni());
            studentManager.updateStudent(testJuan);
            
            // Delete test student
            System.out.println("Deleted student with ID: 6");
            studentManager.deleteStudent(6);

            // Main application loop
            while (option != 5) {
                displayMenu();
                option = getUserOption(scanner);
                
                switch (option) {
                    case 1:
                        studentManager.getAll();
                        break;
                    case 2:
                        addNewStudent(scanner, studentManager);
                        break;
                    case 3:
                        deleteStudentById(scanner, studentManager);
                        break;
                    case 4:
                        updateStudentById(scanner, studentManager);
                        break;
                    case 5:
                        System.out.println("Thank you for using the Student Management System");
                        break;
                    default:
                        System.out.println("Please enter a valid option (1-5)");
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            if (scanner != null) {
                scanner.close();
            }
            // Note: In a real application, you might want to close the DB connection here
            // DBConnection.closeConnection();
        }
    }

    /**
     * Displays the main menu options.
     */
    private static void displayMenu() {
        System.out.println("\n" + 
                          "===== Student Management System =====\n" +
                          "1. Query student data or records\n" +
                          "2. Register a new student\n" +
                          "3. Delete an existing student\n" +
                          "4. Modify student data by ID\n" +
                          "5. Exit\n" +
                          "=====================================");
    }

    /**
     * Gets and validates user menu option.
     * 
     * @param scanner The scanner for user input
     * @return Valid menu option (1-5)
     */
    private static int getUserOption(Scanner scanner) {
        int option = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Enter your choice (1-5): ");
                option = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                if (option >= 1 && option <= 5) {
                    validInput = true;
                } else {
                    System.out.println("Invalid option. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return option;
    }

    /**
     * Handles adding a new student.
     * 
     * @param scanner The scanner for user input
     * @param studentManager The student manager instance
     */
    private static void addNewStudent(Scanner scanner, StudentManager studentManager) {
        System.out.println("\n--- Add New Student ---");
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student surname: ");
        String surname = scanner.nextLine();
        
        int dni = 0;
        boolean validDni = false;
        while (!validDni) {
            try {
                System.out.print("Enter student DNI: ");
                dni = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                validDni = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid DNI. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        Student newStudent = new Student(name, surname, dni);
        studentManager.addStudent(newStudent);
        System.out.println("Student added successfully!\n");
    }

    /**
     * Handles deleting a student by ID.
     * 
     * @param scanner The scanner for user input
     * @param studentManager The student manager instance
     */
    private static void deleteStudentById(Scanner scanner, StudentManager studentManager) {
        System.out.println("\n--- Delete Student ---");
        
        int id = 0;
        boolean validId = false;
        while (!validId) {
            try {
                System.out.print("Enter the ID of the student to delete: ");
                id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                validId = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid ID. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        studentManager.deleteStudent(id);
    }

    /**
     * Handles updating a student by ID.
     * 
     * @param scanner The scanner for user input
     * @param studentManager The student manager instance
     */
    private static void updateStudentById(Scanner scanner, StudentManager studentManager) {
        System.out.println("\n--- Update Student ---");
        
        System.out.print("Enter name for student modification: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter surname for student: ");
        String surname = scanner.nextLine();
        
        int dni = 0;
        boolean validDni = false;
        while (!validDni) {
            try {
                System.out.print("Enter DNI for student: ");
                dni = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                validDni = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid DNI. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        int id = 0;
        boolean validId = false;
        while (!validId) {
            try {
                System.out.print("Enter the ID of the student to modify: ");
                id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                validId = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid ID. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        Student updateStudent = new Student(id, name, surname, dni);
        studentManager.updateStudent(updateStudent);
    }
}
