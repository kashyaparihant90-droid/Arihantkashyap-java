import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.println("\n===== VOTING STATUS =====");

        if(age >= 18) {

            System.out.println(name + " is eligible for voting.");

        } else {

            System.out.println(name + " is not eligible for voting.");
        }

        sc.close();
    }
}