import java.util.Scanner;

public class StringPermutation {

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void permute(char[] arr, int index) {

        if(index == arr.length - 1) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for(int i = index; i < arr.length; i++) {

            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i); // backtrack
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Permutations:");

        permute(str.toCharArray(), 0);

        sc.close();
    }
}