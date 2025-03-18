/*Name:Choo En Yi
 * Lab:8
 * Date:29/11/2023
 * Question 2: Finds the smallest of 100 integer numbers
 */
package LAB8;
import java.util.Scanner;
public class Exercises2 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		// Declare variables
		int num=0,minValue=Integer.MAX_VALUE, count=0;
		
		// while loop
		  while (count<4) {
		   // Read input
		  System.out.print("Enter random number:");
		  num=input.nextInt();
		  if (num< minValue) 
			  minValue=num;
		  count+=1;
		  }
		  System.out.println("The smallest integer is "+ minValue);
		  input.close();
		
	}

}
