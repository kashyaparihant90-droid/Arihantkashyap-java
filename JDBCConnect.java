import java.sql.*;

public class JDBCConnect {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            System.out.println("Database Connected");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}