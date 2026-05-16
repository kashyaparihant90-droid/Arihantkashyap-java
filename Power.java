import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        long base = sc.nextLong();

        System.out.print("Enter exponent: ");
        long exp = sc.nextLong();

        long result = 1;

        for (long i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}