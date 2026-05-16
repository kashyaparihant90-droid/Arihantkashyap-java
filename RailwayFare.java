import java.util.Scanner;

public class RailwayFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String passengerName;
        int distance;
        double fare;

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Distance in KM: ");
        distance = sc.nextInt();

        fare = distance * 2.5;

        if(distance > 500) {

            fare = fare - (fare * 0.10);
        }

        System.out.println("\n===== TRAIN TICKET =====");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Distance: " + distance + " KM");
        System.out.println("Total Fare: Rs. " + fare);

        sc.close();
    }
}