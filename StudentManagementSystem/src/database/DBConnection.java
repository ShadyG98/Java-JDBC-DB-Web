package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Database connection utility class using Singleton pattern.
 * Manages a single database connection for the application.
 */
public class DBConnection {
    
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost/IEFI?serverTimezone=UTC";

    /**
     * Private constructor to prevent instantiation.
     */
    private DBConnection() {
    }

    /**
     * Gets the database connection, creating it if necessary.
     * 
     * @return Connection to the database
     */
    public static Connection getConnection() {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create connection if it doesn't exist
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, "root", "");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * Closes the database connection.
     */
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing database connection: " + e.getMessage());
            }
        }
    }
}
