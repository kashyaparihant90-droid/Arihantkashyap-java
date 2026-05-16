import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        long n = sc.nextLong();

        long a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (long i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}