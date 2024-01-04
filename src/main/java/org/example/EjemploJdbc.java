package org.example;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC-5";
        String username = "root";
        String password = "2404";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM productos")) {

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultSet.getString("nombre"));
                System.out.print(" | ");
                System.out.print(resultSet.getInt("precio"));
                System.out.print(" | ");
                System.out.print(resultSet.getDate("fecha_registro"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}