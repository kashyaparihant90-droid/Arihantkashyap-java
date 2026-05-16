import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long a = sc.nextLong();

        System.out.print("Enter second number: ");
        long b = sc.nextLong();

        long gcd = 1;

        for (long i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);

        sc.close();
    }
}