package FINAL;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        int[] newArray = new int[3];

        System.out.print("Enter 10 integers:");

        // Input integers into the original array
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Reverse the array and store it in newArray
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }

        // Display the reversed array
        System.out.print("Reverse Array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        // Close the scanner
        input.close();
    }
}
