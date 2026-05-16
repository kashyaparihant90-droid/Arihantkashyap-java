import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long a = sc.nextLong();

        System.out.print("Enter second number: ");
        long b = sc.nextLong();

        long max = (a > b) ? a : b;
        long lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}