import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;
}

public class UpdateStudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        // Input students
        for(int i = 0; i < n; i++) {

            students[i] = new Student();

            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Roll No: ");
            students[i].rollNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Marks: ");
            students[i].marks = sc.nextDouble();
        }

        // Update marks
        System.out.print("\nEnter Roll No to update marks: ");
        int roll = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {

            if(students[i].rollNo == roll) {

                System.out.print("Enter new marks: ");
                students[i].marks = sc.nextDouble();

                found = true;
                System.out.println("Marks updated successfully!");
                break;
            }
        }

        if(!found) {
            System.out.println("Student not found!");
        }

        // Display all students
        System.out.println("\n===== UPDATED STUDENT LIST =====");

        for(int i = 0; i < n; i++) {

            System.out.println("\nRoll No: " + students[i].rollNo);
            System.out.println("Name: " + students[i].name);
            System.out.println("Marks: " + students[i].marks);
        }

        sc.close();
    }
}