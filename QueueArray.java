import java.util.Scanner;

public class QueueArray {

    static int max = 100;
    static int queue[] = new int[max];
    static int front = -1, rear = -1;

    static void enqueue(int value) {

        if(rear == max - 1) {
            System.out.println("Queue Overflow");
        } else {

            if(front == -1) {
                front = 0;
            }

            queue[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    static void dequeue() {

        if(front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " removed from queue");
            front++;
        }
    }

    static void display() {

        if(front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {

            System.out.println("Queue elements:");

            for(int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, value;

        do {

            System.out.println("\n===== QUEUE MENU =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}
