import java.util.Scanner;

public class MobileRecharge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("===== MOBILE RECHARGE SYSTEM =====");
        System.out.println("1. Rs. 199 Plan");
        System.out.println("2. Rs. 399 Plan");
        System.out.println("3. Rs. 599 Plan");

        System.out.print("Select Recharge Plan: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:

                System.out.println("You selected Rs. 199 Plan");
                System.out.println("Validity: 28 Days");
                System.out.println("Data: 1GB/day");
                break;

            case 2:

                System.out.println("You selected Rs. 399 Plan");
                System.out.println("Validity: 56 Days");
                System.out.println("Data: 1.5GB/day");
                break;

            case 3:

                System.out.println("You selected Rs. 599 Plan");
                System.out.println("Validity: 84 Days");
                System.out.println("Data: 2GB/day");
                break;

            default:

                System.out.println("Invalid Plan Selection.");
        }

        sc.close();
    }
}