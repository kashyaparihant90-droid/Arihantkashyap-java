import java.util.Scanner;

public class RegexCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mobile = sc.nextLine();

        if(mobile.matches("[0-9]{10}")) {
            System.out.println("Valid Mobile");
        } else {
            System.out.println("Invalid Mobile");
        }

        sc.close();
    }
}