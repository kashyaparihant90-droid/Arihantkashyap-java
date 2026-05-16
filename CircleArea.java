import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        long r = sc.nextLong();

        double area = 3.14 * r * r;

        System.out.println("Area = " + area);

        sc.close();
    }
}