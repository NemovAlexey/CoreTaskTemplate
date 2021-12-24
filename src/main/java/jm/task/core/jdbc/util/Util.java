package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() throws SQLException {
        final String URL = "jdbc:mysql://localhost:3306/user_schema";
        final String USERNAME = "root";
        final String PASSWORD = "Nhbnjy667";
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}