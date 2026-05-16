import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        long celsius = sc.nextLong();

        double fahrenheit = (celsius * 9.0 / 5) + 32;

        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}