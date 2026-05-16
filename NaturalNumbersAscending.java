import java.util.Scanner;

public class NaturalNumbersAscending {

    static void printAsc(int n, int i) {

        if(i > n) {
            return;
        }

        System.out.print(i + " ");
        printAsc(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Ascending order:");

        printAsc(n, 1);

        sc.close();
    }
}