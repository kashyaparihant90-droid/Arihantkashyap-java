import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        int count = words.length;

        System.out.println("Word count = " + count);

        sc.close();
    }
}