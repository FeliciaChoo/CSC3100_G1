package FINAL;
import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Eliminate duplicates and display distinct numbers
        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int value : distinctNumbers) {
            System.out.print(value + " ");
        }

        input.close();
    }

    // Method to eliminate duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        int countDistinct = 0;
        boolean[] isDuplicate = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            if (!isDuplicate[i]) {
                countDistinct++;
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        isDuplicate[j] = true;
                    }
                }
            }
        }

        int[] distinctNumbers = new int[countDistinct];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (!isDuplicate[i]) {
                distinctNumbers[index++] = list[i];
            }
        }

        return distinctNumbers;
    }
}

