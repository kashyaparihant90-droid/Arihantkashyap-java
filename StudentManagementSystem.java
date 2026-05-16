import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Students");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
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
                    break;

                case 2:
                    System.out.println("\n===== STUDENT LIST =====");

                    for(int i = 0; i < n; i++) {

                        System.out.println("\nRoll No: " + students[i].rollNo);
                        System.out.println("Name: " + students[i].name);
                        System.out.println("Marks: " + students[i].marks);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < n; i++) {

                        if(students[i].rollNo == searchRoll) {

                            System.out.println("\nStudent Found!");
                            System.out.println("Name: " + students[i].name);
                            System.out.println("Marks: " + students[i].marks);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}