import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int num = 1;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

        sc.close();
    }
}