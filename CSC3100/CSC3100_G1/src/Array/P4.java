package Array;
import java.util.Scanner;
public class P4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Constants
	        int NUM_STUDENTS = 5;

	        // Initialize array to store test scores
	        double[] grades = new double[NUM_STUDENTS];

	        // Input test scores for each student
	        for (int i = 0; i < NUM_STUDENTS; i++) {
	            System.out.print("Enter test score for student " + (i + 1) + ": ");
	            grades[i] = scanner.nextDouble();
	        }

	        // Input student number and display test score
	        System.out.print("Enter student number (1 to 30): ");
	        int studentNumber = scanner.nextInt();

	        if (studentNumber >= 1 && studentNumber <= NUM_STUDENTS) {
	            double testScore = grades[studentNumber - 1];
	            System.out.println("Test score for student " + studentNumber + ": " + testScore);
	        } else {
	            System.out.println("Invalid student number. Please enter a number between 1 and 30.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


