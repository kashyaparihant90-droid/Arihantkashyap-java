import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class SinglyLinkedList {

    static Node head = null;

    static void insert(int value) {

        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println(value + " inserted");
    }

    static void display() {

        if(head == null) {
            System.out.println("List is empty");
        } else {

            Node temp = head;

            System.out.println("Linked List elements:");

            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, value;

        do {

            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insert(value);
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);

        sc.close();
    }
}