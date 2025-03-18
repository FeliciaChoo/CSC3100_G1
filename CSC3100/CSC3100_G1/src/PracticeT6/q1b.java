package PracticeT6;
import java.util.Scanner;

public class q1b{
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); // create a scanner object

	        // Declare variables
	        char char1,char2;
	        int int1,int2,minValue;
	        double powerOfMinValue,average;

	        // Read input for the first character
	        do {
	            System.out.print("Enter the first character(0-9): ");
	            String inputStr1 = input.next();
	            if (inputStr1.length() == 1 && Character.isDigit(inputStr1.charAt(0))) {
	                char1 = inputStr1.charAt(0);
	                int1 = (int)char1; // Convert char to int
	                break; // Exit the loop if a valid input is provided
	            } else {
	                System.out.println("Invalid input. Please enter a valid single-digit character.");
	            }
	        } while (true); // Continue until a valid input is provided

	        // Read input for the second character
	        do {
	            System.out.print("Enter the second character(0-9): ");
	            String inputStr2 = input.next();
	            if (inputStr2.length() == 1 && Character.isDigit(inputStr2.charAt(0))) {
	                char2 = inputStr2.charAt(0);
	                int2 = (int)char2; // Convert char to int
	                break; // Exit the loop if a valid input is provided
	            } else {
	                System.out.println("Invalid input. Please enter a valid single-digit character.");
	            }
	        } while (true); // Continue until a valid input is provided

	        // Calculate values
	        minValue = Math.min(int1, int2);
	        powerOfMinValue = Math.pow(minValue, 2);
	        average = (int1 + int2) / 2.0;

	        // Print output
	        System.out.println("____________________________________");
	        System.out.println("**************RESULTS***************");
	        System.out.println("First character: " + int1);
	        System.out.println("Second character: " + int2);
	        System.out.println("Minimum value of character: " + minValue);
	        System.out.printf("Power of Minimum value: %.2f%n", powerOfMinValue);
	        System.out.printf("Average value of character: %.2f%n", average);

	        input.close();
	    }
	}


