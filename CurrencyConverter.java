import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rupees, dollars;

        System.out.print("Enter amount in Rupees: ");
        rupees = sc.nextDouble();

        // Example Conversion Rate
        dollars = rupees / 83.0;

        System.out.println("Amount in Dollars = $" + dollars);

        sc.close();
    }
}