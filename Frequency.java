import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        long n = sc.nextLong();

        long[] arr = new long[(int) n];
        boolean[] visited = new boolean[(int) n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            visited[i] = false;
        }

        System.out.println("Element frequencies:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            long count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }

        sc.close();
    }
}