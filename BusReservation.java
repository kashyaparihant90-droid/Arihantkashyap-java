import java.util.Scanner;

public class BusReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 30;
        int bookedSeats = 0;

        int choice, seats;

        do {

            System.out.println("\n===== BUS RESERVATION SYSTEM =====");
            System.out.println("1. Check Available Seats");
            System.out.println("2. Book Seats");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("Available Seats: " + (totalSeats - bookedSeats));
                    break;

                case 2:

                    System.out.print("Enter number of seats to book: ");
                    seats = sc.nextInt();

                    if(seats <= (totalSeats - bookedSeats)) {

                        bookedSeats = bookedSeats + seats;

                        System.out.println("Seats booked successfully.");
                        System.out.println("Remaining Seats: " + (totalSeats - bookedSeats));

                    } else {

                        System.out.println("Seats not available.");
                    }

                    break;

                case 3:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while(choice != 3);

        sc.close();
    }
}