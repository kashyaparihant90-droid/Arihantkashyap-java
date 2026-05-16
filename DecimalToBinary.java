import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        String binary = "";

        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        System.out.println("Binary number is: " + binary);

        sc.close();
    }
}