/*Name:Choo En Yi
 * Lab:8
 * Date:29/11/2023
 * Question 3: Reads and calculates the sum of an unspecified number of integers. The input 0 signifies the end of the input
 */
package LAB8;
import java.util.Scanner;
public class Exercises3 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		
		//Declare variables
		int sum=0,num=0;
		System.out.print("Enter random integer and 0 to stop it:");
		num=input.nextInt();
		// while loop
		while ((num!=0)) {
			sum+=num;
			System.out.print("Enter random integer and 0 to stop it:");
			num=input.nextInt();
			
		}
		System.out.println("The sum of the random integers is "+ sum);
		input.close();
		
	}
}
