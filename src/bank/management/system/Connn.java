package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect to the database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem",
                    "root",
                    "amandineshsingh@2003"
            );

            // Create statement
            statement = connection.createStatement();

            // Confirm connection
            System.out.println("Connected successfully to bankSystem database.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
