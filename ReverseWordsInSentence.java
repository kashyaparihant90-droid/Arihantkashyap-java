import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence;

        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();

        String words[] = sentence.split(" ");

        System.out.println("Reversed Words Sentence:");

        for(int i = 0; i < words.length; i++) {

            String word = words[i];
            String reverse = "";

            for(int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }

            System.out.print(reverse + " ");
        }

        sc.close();
    }
}