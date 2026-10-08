import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "@SamiDan911";

        try {
            // Register driver and open connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database successfully!");

            // Close connection when finished
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}