import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    double marks;

    void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    void display() {

        System.out.println("\n===== Student Details =====");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.input();
        s1.display();
    }
}