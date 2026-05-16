import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&";
        String password = "";

        int length;

        System.out.print("Enter password length: ");
        length = sc.nextInt();

        for(int i = 1; i <= length; i++) {

            int index = rand.nextInt(characters.length());

            password = password + characters.charAt(index);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}