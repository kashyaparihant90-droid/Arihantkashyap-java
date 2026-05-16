import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        long fahrenheit = sc.nextLong();

        double celsius = (fahrenheit - 32) * 5.0 / 9;

        System.out.println("Celsius = " + celsius);

        sc.close();
    }
}