package FINAL;
import java.util.Scanner;

public class PartitionList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the list
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.print("Enter list content: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        // Perform partition
        int pivotIndex = partition(list);

        // Display the list after partition
        System.out.print("After the partition, the list is ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println("\nThe pivot is at index " + pivotIndex);

        input.close();
    }

    // Method to partition the list using the first element as pivot
    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > 0 && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[0] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return 0;
        }
    }
}
