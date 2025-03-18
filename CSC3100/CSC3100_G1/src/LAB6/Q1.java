/*Name:Choo En Yi
 * Lab:6
 * Date:15/11/2023
 * Question 1: Display character class
 */
package LAB6;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int int1, int2, minValue;
        double powerOfMinValue, average;
        char char1, char2;

        // Read and validate input for the first character
        System.out.print("Enter the first character(0-9): ");
        String inputStr1 = input.next();
        if (inputStr1.length() == 1 && Character.isDigit(inputStr1.charAt(0))) {
            char1 = inputStr1.charAt(0);
            int1 = (int)char1; // Convert char to int
            System.out.print("Enter the second character(0-9): ");
            String inputStr2 = input.next();
            if (inputStr2.length() == 1 && Character.isDigit(inputStr2.charAt(0))) {
                char2 = inputStr2.charAt(0);
                int2 = (int)char2; // Convert char to int
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
                System.out.printf("Average value of character: %.2f%n", average);}
            else 
                System.out.println("Invalid input for the second character. Please enter a valid single digit.");
        }
    else
        System.out.println("Invalid input for the first character. Please enter a valid single digit.");
    

        input.close();
    }
}

