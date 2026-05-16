import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== JAVA QUIZ GAME =====");

        // Question 1
        System.out.println("\n1. Which keyword is used to create object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. static");
        System.out.println("4. void");

        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if(answer == 2) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which method is entry point of Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. init()");

        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if(answer == 3) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which symbol is used for single line comment?");
        System.out.println("1. <!-- -->");
        System.out.println("2. ##");
        System.out.println("3. //");
        System.out.println("4. **");

        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if(answer == 3) {
            score++;
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}
