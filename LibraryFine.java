import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int daysLate;
        double fine = 0;

        System.out.print("Enter number of late days: ");
        daysLate = sc.nextInt();

        if(daysLate <= 5) {

            fine = daysLate * 2;

        } 
        else if(daysLate <= 10) {

            fine = (5 * 2) + ((daysLate - 5) * 5);

        } 
        else {

            fine = (5 * 2) + (5 * 5) + ((daysLate - 10) * 10);
        }

        System.out.println("Total Fine = Rs. " + fine);

        sc.close();
    }
}