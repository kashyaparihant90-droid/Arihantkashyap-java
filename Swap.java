import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long a = sc.nextLong();

        System.out.print("Enter second number: ");
        long b = sc.nextLong();

        long temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("First = " + a);
        System.out.println("Second = " + b);

        sc.close();
    }
}