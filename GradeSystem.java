import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        switch(marks / 10) {
            case 10:
            case 9:
                System.out.println("A Grade");
                break;
            case 8:
                System.out.println("B Grade");
                break;
            case 7:
                System.out.println("C Grade");
                break;
            case 6:
                System.out.println("D Grade");
                break;
            default:
                System.out.println("Fail");
        }

        sc.close();
    }
}