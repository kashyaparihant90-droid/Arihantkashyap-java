import java.io.*;
import java.sql.*;

public class FileDBCombo {
    public static void main(String[] args) throws Exception {

        File file = new File("data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        while((line = br.readLine()) != null) {
            System.out.println("Reading: " + line);
        }

        br.close();
    }
}