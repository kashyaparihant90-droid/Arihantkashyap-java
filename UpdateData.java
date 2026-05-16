import java.sql.*;

public class UpdateData {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            String query = "UPDATE student SET name='Ravi' WHERE id=1";

            Statement st = con.createStatement();
            st.executeUpdate(query);

            System.out.println("Updated");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}