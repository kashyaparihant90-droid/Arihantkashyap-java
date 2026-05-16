import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Hello Boss, this is Java File Handling!");
            fw.close();

            System.out.println("File Written Successfully");
        } catch(IOException e) {
            System.out.println("Error occurred");
        }
    }
}