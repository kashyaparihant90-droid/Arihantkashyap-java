import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text;
        int shift;

        System.out.print("Enter a message: ");
        text = sc.nextLine();

        System.out.print("Enter shift value: ");
        shift = sc.nextInt();

        String encryptedText = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                ch = (char)((ch - 'a' + shift) % 26 + 'a');

            } else if (ch >= 'A' && ch <= 'Z') {

                ch = (char)((ch - 'A' + shift) % 26 + 'A');
            }

            encryptedText = encryptedText + ch;
        }

        System.out.println("Encrypted Message: " + encryptedText);

        sc.close();
    }
}