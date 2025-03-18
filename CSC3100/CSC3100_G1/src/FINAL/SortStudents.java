package FINAL;
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create arrays to store names and scores
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        // Prompt the user to enter names and scores
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name for student " + (i + 1) + ": ");
            names[i] = input.next(); // Assuming names without spaces
            System.out.print("Enter the score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // Sort students in decreasing order of scores
        sortStudentsDescending(names, scores);

        // Print the sorted list
        System.out.println("\nStudents sorted in decreasing order of scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }

        input.close();
    }

    // Method to sort students in decreasing order of scores
    private static void sortStudentsDescending(String[] names, int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    // Swap scores
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Swap names accordingly
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}
