package FINAL;
import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int size1 = scanner.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int size2 = scanner.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = scanner.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        // Sort the arrays before comparing to check for identical contents
        Arrays.sort(list1);
        Arrays.sort(list2);

        return Arrays.equals(list1, list2);
    }
}
