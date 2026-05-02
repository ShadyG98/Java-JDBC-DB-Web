package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Manages Student entities in the database.
 * Provides CRUD operations for Student objects.
 */
public class StudentManager {

    /**
     * Adds a new student to the database.
     * 
     * @param newStudent The student to add
     */
    public void addStudent(Student newStudent) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO Students (name, surname, dni) VALUES (?,?,?)")) {

            stmt.setString(1, newStudent.getName());
            stmt.setString(2, newStudent.getSurname());
            stmt.setInt(3, newStudent.getDni());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error adding student: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Deletes a student from the database by ID.
     * 
     * @param deleteId The ID of the student to delete
     */
    public void deleteStudent(int deleteId) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "DELETE FROM Students WHERE id_student = ?")) {

            stmt.setInt(1, deleteId);
            stmt.executeUpdate();
            System.out.println("Student deleted successfully");

        } catch (SQLException e) {
            System.err.println("Error deleting student: " + e.getMessage());
        }
    }

    /**
     * Updates an existing student in the database.
     * 
     * @param newStudent The student with updated information
     */
    public void updateStudent(Student newStudent) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "UPDATE Students SET name = ?, surname = ?, dni = ? WHERE id_student = ?")) {

            stmt.setString(1, newStudent.getName());
            stmt.setString(2, newStudent.getSurname());
            stmt.setInt(3, newStudent.getDni());
            stmt.setInt(4, newStudent.getId_student());

            stmt.executeUpdate();
            System.out.println("Student updated successfully");

        } catch (SQLException e) {
            System.err.println("Error updating student: " + e.getMessage());
        }
    }

    /**
     * Retrieves and displays all students from the database.
     */
    public void getAll() {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Students");
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Surname: %s | DNI: %d%n",
                        rs.getInt("id_student"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getInt("dni"));
            }
            System.out.println("--- End of Records ---\n");

        } catch (SQLException e) {
            System.err.println("Error retrieving students: " + e.getMessage());
        }
    }
}
