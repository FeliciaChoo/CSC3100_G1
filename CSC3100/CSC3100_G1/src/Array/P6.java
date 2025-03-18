package Array;
import java.util.Scanner;
public class P6 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Constants
	        int NUM_STUDENTS = 30;

	        // Initialize arrays to store student names and letter grades
	        String[] studentNames = new String[NUM_STUDENTS];
	        char[] letterGrades = new char[NUM_STUDENTS];

	        // Input student names and test scores
	        for (int i = 0; i < NUM_STUDENTS; i++) {
	            System.out.print("Enter last name for student " + (i + 1) + ": ");
	            studentNames[i] = scanner.nextLine();

	            System.out.print("Enter test score for student " + studentNames[i] + ": ");
	            double testScore = scanner.nextDouble();
	            scanner.nextLine();  // Consume the newline character

	            // Calculate letter grade based on test score
	            char grade = calculateLetterGrade(testScore);
	            letterGrades[i] = grade;
	        }

	        // Input student name and display letter grade
	        System.out.print("Enter student last name: ");
	        String studentLastName = scanner.nextLine();

	        int studentIndex = findStudentIndex(studentLastName, studentNames);

	        if (studentIndex != -1) {
	            char letterGrade = letterGrades[studentIndex];
	            System.out.println("Letter grade for student " + studentLastName + ": " + letterGrade);
	        } else {
	            System.out.println("Student not found. Please enter a valid last name.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Helper method to calculate letter grade based on test score
	    private static char calculateLetterGrade(double testScore) {
	        if (testScore >= 90.0) {
	            return 'A';
	        } else if (testScore >= 80.0) {
	            return 'B';
	        } else if (testScore >= 70.0) {
	            return 'C';
	        } else if (testScore >= 60.0) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }

	    // Helper method to find the index of a student in the array
	    public static int findStudentIndex(String studentName, String[] studentNames) {
	        for (int i = 0; i < studentNames.length; i++) {
	            if (studentNames[i].equalsIgnoreCase(studentName)) {
	                return i;
	            }
	        }
	        return -1; // Student not found
	    }
	}


