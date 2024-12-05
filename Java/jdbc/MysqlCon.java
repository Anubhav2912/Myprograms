package com.anu.learning.jdbc;

import java.sql.*;

class MysqlCon {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "********************";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Display success message
            System.out.println("Connected to the database!");

            // Do something with the connection (e.g., execute SQL queries)
            // ...

        } catch (SQLException | ClassNotFoundException e) {
            // Handle errors
            e.printStackTrace();
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}  