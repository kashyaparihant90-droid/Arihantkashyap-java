import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String productName;
        int quantity;
        double price, totalBill, discount = 0;

        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price per Product: ");
        price = sc.nextDouble();

        totalBill = quantity * price;

        if(totalBill >= 5000) {

            discount = totalBill * 0.20;

        } else if(totalBill >= 2000) {

            discount = totalBill * 0.10;
        }

        double finalBill = totalBill - discount;

        System.out.println("\n===== SHOPPING BILL =====");
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: Rs. " + totalBill);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Bill: Rs. " + finalBill);

        sc.close();
    }
}