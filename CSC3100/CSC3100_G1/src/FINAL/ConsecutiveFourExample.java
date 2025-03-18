package FINAL;
import java.util.Scanner;

public class ConsecutiveFourExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the input size
        System.out.print("Enter the number of values in the series: ");
        int size = scanner.nextInt();

        // Prompt the user to enter a series of integers
        System.out.println("Enter the series of integers:");
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        // Check for consecutive four equal numbers
        if (isConsecutiveFour(values)) {
            System.out.println("The series contains four consecutive numbers with the same value.");
        } else {
            System.out.println("The series does not contain four consecutive numbers with the same value.");
        }

        scanner.close();
    }

    // Method to check if an array has four consecutive numbers with the same value
    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i <= values.length - 4; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}
