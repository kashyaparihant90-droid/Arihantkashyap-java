import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        boolean isDuck = false;

        for (int i = 1; i < num.length(); i++) {

            if (num.charAt(i) == '0') {
                isDuck = true;
                break;
            }
        }

        if (isDuck) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is not a Duck Number.");
        }

        sc.close();
    }
}