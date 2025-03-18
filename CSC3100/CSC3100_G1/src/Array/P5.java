package Array;
import java.util.Scanner;
public class P5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Constants
	        int NUM_STUDENTS = 25;
	        int NUM_TESTS = 5; // Assuming there are 5 tests, you can adjust this as needed

	        // Initialize 2D array to store test grades
	        double[][] testGrades = new double[NUM_STUDENTS][NUM_TESTS];

	        // Input test grades for each student
	        for (int student = 0; student < NUM_STUDENTS; student++) {
	            System.out.println("Enter test grades for student " + (student + 1) + ":");
	            for (int test = 0; test < NUM_TESTS; test++) {
	                System.out.print("Test " + (test + 1) + ": ");
	                testGrades[student][test] = scanner.nextDouble();
	            }
	        }

	        // Input student number and test number
	        System.out.print("Enter student number (1 to 25): ");
	        int studentNumber = scanner.nextInt();

	        System.out.print("Enter test number (1 to " + NUM_TESTS + "): ");
	        int testNumber = scanner.nextInt();

	        // Display the grade for the specified student and test
	        if (isValidInput(studentNumber, testNumber, NUM_STUDENTS, NUM_TESTS)) {
	            double grade = testGrades[studentNumber - 1][testNumber - 1];
	            System.out.println("Grade for student " + studentNumber + " on Test " + testNumber + ": " + grade);
	        } else {
	            System.out.println("Invalid student or test number. Please enter valid numbers.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Helper method to check if the input is valid
	    public static boolean isValidInput(int studentNumber, int testNumber, int numStudents, int numTests) {
	        return studentNumber >= 1 && studentNumber <= numStudents &&
	               testNumber >= 1 && testNumber <= numTests;
	    }
	}
