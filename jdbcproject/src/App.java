import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "sahananagesh"; // change this

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!");
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}
