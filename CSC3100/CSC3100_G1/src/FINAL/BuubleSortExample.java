package FINAL;
import java.util.Scanner;

public class BuubleSortExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 double numbers
        double[] numbers = new double[10];
        System.out.print("Enter 10 double numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // Sort the numbers using bubble sort
        bubbleSort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }

        input.close();
    }

    // Method to perform bubble sort on an array of double numbers
    private static void bubbleSort(double[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap values if they are in the wrong order
                    double temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    swapped = true;
                }
            }
            // After each pass, the largest element is guaranteed to be at the end,
            // so we can reduce the range of comparison
            n--;
        } while (swapped);
    }
}
