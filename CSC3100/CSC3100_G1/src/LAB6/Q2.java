/*Name:Choo En Yi
 * Lab:6
 * Date:15/11/2023
 * Question 1b: Display major and status student
 */
package LAB6;
import java.util.Scanner;
public class Q2 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		// Declare variables
		String major="";
		String status="";
		String userInput="";
		
		// Read input 
		System.out.println("I: Information Management");
		System.out.println("C: Computer Science");
		System.out.println("A: Accounting");
		System.out.println("1:Year 1");
		System.out.println("2:Year 2");
		System.out.println("3:Year 3");
		System.out.println("4:Year 4");
		System.out.println("Eg.Enter two characters:A2 ");
		System.out.print("Enter two characters:");
		userInput=input.nextLine();
		if (userInput.length()==2) {
		char majorCode=userInput.charAt(0);
		char statusCode=userInput.charAt(1);
		
		// Determine major based on fist character
		switch(majorCode) {
		case'I':major="Information Management"; break;
		case'C': major="Computer Science";break;
		case'A': major="Accounting";break;
		default: major="Unknown major" ;
		}
		// Determine status based on second character
		switch(statusCode) {
		case '1':status="Freshman"; break;
		case '2': status="Sophomore";break;
		case '3': status="Junior";break;
		case '4': status="Senior";break;
		default: status= "Unknown Status";
		}
		//Print the output
		System.out.println("%%%%%%%%%%%STUDENT MAJOR AND STATUS%%%%%%%%%%%%%%%");
		System.out.println("Major:"+major);
		System.out.println("Status:"+ status);
		
		}else {
			System.out.println("Invalid input. Please enter exactly two characters.");
		     
		input.close();
		
	}
}

}
