import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String employeeName;
        double basicSalary, hra, da, totalSalary;

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;

        totalSalary = basicSalary + hra + da;

        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);

        sc.close();
    }
}