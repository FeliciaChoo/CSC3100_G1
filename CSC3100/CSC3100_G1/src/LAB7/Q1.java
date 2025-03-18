/*Name:Choo En Yi
 * Lab:7
 * Date:22/11/2023
 * Question 1: Display the string with specific condition
 */
package LAB7;
import java.util.Scanner;
public class Q1 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); // create a scanner object
	        // Declare variables
	        String str1, str2;

	        // Read input
	        System.out.print("Enter the first string:");
	        str1 = input.nextLine();

	        int length = str1.length(); // Corrected the length assignment

	        if ((length > 6) && Character.isDigit(str1.charAt(length - 1))) {
	            System.out.println("Invalid password.");
	            System.out.println("First string: \"" + str1 + "\" with length " + length);
	        } else {
	            System.out.println("Valid password");
	            System.out.println("First string: \"" + str1 + "\" with length " + length);
	        }

	        // Checking if the second string exists in the first string
	        System.out.print("Enter the second string:");
	        str2 = input.nextLine();

	        if (str1.contains(str2)) {
	            System.out.println("\"" + str2 + "\"" + " is exist in " + "\"" + str1 + "\"");
	        } else {
	            System.out.println("\"" + str2 + "\"" + " is not exist in " + "\"" + str1 + "\"");
	            System.out.println("New Statement in String 1: " + str1 + str2); // Corrected the syntax
	            input.close();
	        }
	    } 
	    
	}


