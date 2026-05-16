import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        long length = sc.nextLong();

        System.out.print("Enter breadth: ");
        long breadth = sc.nextLong();

        long area = length * breadth;

        System.out.println("Area = " + area);

        sc.close();
    }
}