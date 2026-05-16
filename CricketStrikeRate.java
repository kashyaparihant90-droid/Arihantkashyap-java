import java.util.Scanner;

public class CricketStrikeRate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String playerName;
        int runs, balls;
        double strikeRate;

        System.out.print("Enter Player Name: ");
        playerName = sc.nextLine();

        System.out.print("Enter Runs Scored: ");
        runs = sc.nextInt();

        System.out.print("Enter Balls Faced: ");
        balls = sc.nextInt();

        strikeRate = (runs * 100.0) / balls;

        System.out.println("\n===== PLAYER DETAILS =====");
        System.out.println("Player Name: " + playerName);
        System.out.println("Runs: " + runs);
        System.out.println("Balls Faced: " + balls);
        System.out.println("Strike Rate: " + strikeRate);

        sc.close();
    }
}