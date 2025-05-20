package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect() {
        try {
           String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyGiay;encrypt=true;trustServerCertificate=true";
            String user = "sa";      // Your SQL Server username
            String password = "lamlai"; // Your password
            Connection conn = DriverManager.getConnection(url, user, password);
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại: " + e.getMessage());
            return null;
        }
    }
}
