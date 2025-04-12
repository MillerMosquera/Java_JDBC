package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {


    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC-5";
    private static String username = "root";
    private static String password = "2404";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
