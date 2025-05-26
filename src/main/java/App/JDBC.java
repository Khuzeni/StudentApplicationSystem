package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/studentapplicationsystem";
    private static final String USER = "root"; // replace with your DB username
    private static final String PASSWORD = "Sulethu@6"; // replace with your DB password

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure driver is loaded
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


