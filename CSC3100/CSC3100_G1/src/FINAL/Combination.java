package FINAL;
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display all combinations of picking two numbers
        System.out.println("All combinations of picking two numbers:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
            }
        }

        scanner.close();
    }
}
