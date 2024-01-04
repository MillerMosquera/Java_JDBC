package org.example;

import org.example.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {


        try (Connection conn = ConexionBaseDatos.getInstance();
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