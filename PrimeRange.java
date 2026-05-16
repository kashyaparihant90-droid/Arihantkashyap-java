import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        long start = sc.nextLong();

        System.out.print("Enter end: ");
        long end = sc.nextLong();

        System.out.println("Prime numbers:");

        for (long num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;

                for (long i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }

        sc.close();
    }
}