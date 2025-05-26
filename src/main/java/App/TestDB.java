package App;



import java.sql.Connection;
import java.sql.SQLException;

public class TestDB{
    public static void main(String[] args) {
        try (Connection conn = JDBC.getConnection()){
            System.out.println("Connected to database");
        }catch (SQLException e){
            System.out.println("Failed to connect to database");
            e.printStackTrace();
        }
    }
}
