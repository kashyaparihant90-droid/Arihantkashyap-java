import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        long p = sc.nextLong();

        System.out.print("Enter rate: ");
        long r = sc.nextLong();

        System.out.print("Enter time: ");
        long t = sc.nextLong();

        long si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}