package FINAL;
import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Reverse the array and display the reversed array
        int[] reversedArray = reverse(numbers);
        System.out.print("Reversed array: ");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }

        input.close();
    }

    // Method to reverse an array
    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        return reversedArray;
    }
}
