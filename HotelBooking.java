import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalRooms = 20;
        int bookedRooms = 0;

        int choice, rooms;

        do {

            System.out.println("\n===== HOTEL BOOKING SYSTEM =====");
            System.out.println("1. Check Available Rooms");
            System.out.println("2. Book Rooms");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("Available Rooms: " + (totalRooms - bookedRooms));
                    break;

                case 2:

                    System.out.print("Enter number of rooms to book: ");
                    rooms = sc.nextInt();

                    if(rooms <= (totalRooms - bookedRooms)) {

                        bookedRooms = bookedRooms + rooms;

                        System.out.println("Rooms booked successfully.");
                        System.out.println("Remaining Rooms: " + (totalRooms - bookedRooms));

                    } else {

                        System.out.println("Rooms not available.");
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