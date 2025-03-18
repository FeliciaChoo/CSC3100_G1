package FINAL;
import java.util.Scanner;

public class MergedClassSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the first sorted list
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        // Input for the second sorted list
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        // Merge the two lists
        int[] mergedList = merge(list1, list2);

        // Display the merged list
        System.out.print("The merged list is ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }

        input.close();
    }

    // Method to merge two sorted lists
    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];

        int i = 0, j = 0, k = 0;

        // Merge until one of the lists is exhausted
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                mergedList[k++] = list1[i++];
            } else {
                mergedList[k++] = list2[j++];
            }
        }

        // Copy the remaining elements from list1, if any
        while (i < list1.length) {
            mergedList[k++] = list1[i++];
        }

        // Copy the remaining elements from list2, if any
        while (j < list2.length) {
            mergedList[k++] = list2[j++];
        }

        return mergedList;
    }
}
