/*Name:Choo En Yi
 * Lab:7
 * Date:22/11/2023
 * Question 2: Display the correct Social Security number
 */
package LAB7;
import java.util.Scanner;
public class Q2 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); //create a scanner object
		// Declare variables
		String  ssn="";
		
		// Read input
		System.out.print("Enter a Social Security Number(format:DDD-DD-DDDD):");
		ssn= input.nextLine();
		
		// if-else statement
		if (ssn.matches("\\d{3}-\\d{2}-\\d{4}"))
		   System.out.println(ssn+"is a valid social security number.");
		   else
			   System.out.println(ssn+" is an invalid social security number.");
		input.close();
		}
}
