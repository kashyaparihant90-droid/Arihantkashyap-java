import java.sql.*;

public class InsertData {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            String query = "INSERT INTO student VALUES (1, 'Aman')";

            Statement st = con.createStatement();
            st.executeUpdate(query);

            System.out.println("Data Inserted");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}