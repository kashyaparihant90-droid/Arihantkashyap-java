import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        long n = sc.nextLong();

        long[] arr = new long[(int) n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Long.MIN_VALUE) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println("Second largest = " + second);
        }

        sc.close();
    }
}