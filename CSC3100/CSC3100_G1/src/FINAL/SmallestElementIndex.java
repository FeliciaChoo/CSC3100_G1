package FINAL;
import java.util.Scanner;

public class SmallestElementIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // Find and display the index of the smallest element
        int smallestIndex = indexOfSmallestElement(numbers);
        System.out.println("The index of the smallest element is: " + smallestIndex);

        input.close();
    }

    // Method to find the index of the smallest element in the array
    public static int indexOfSmallestElement(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
