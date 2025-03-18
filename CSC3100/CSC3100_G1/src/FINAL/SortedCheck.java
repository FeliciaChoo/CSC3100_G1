package FINAL;
import java.util.Scanner;

public class SortedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a list
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        // Check if the list is sorted and display the result
        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }

        input.close();
    }

    // Method to check if the list is sorted in decreasing order
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] < list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

