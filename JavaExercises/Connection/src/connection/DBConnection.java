package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Simple database connection example for learning JDBC.
 * In a real application, credentials should not be hardcoded.
 */
public class DBConnection {

    private Connection con;

    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/javadb", 
                    "username", 
                    "password");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        try (Statement statement = dbConnection.con.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from usuario")) {
             
            while (resultSet.next()) {
                System.out.printf("%d %s %s%n", 
                        resultSet.getInt("id"), 
                        resultSet.getString("user"), 
                        resultSet.getString("dni"));
            }
        } catch (SQLException e) {
            System.err.println("Error executing query: " + e.getMessage());
        }
    }
}