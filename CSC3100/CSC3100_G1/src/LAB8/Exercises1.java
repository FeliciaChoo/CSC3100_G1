/*Name:Choo En Yi
 * Lab:8
 * Date:29/11/2023
 * Question 1: Reads 100 random integer numbers
 */
package LAB8;
import java.util.Scanner;
public class Exercises1 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		
		// Declare variables
		int count=0, num=0;
		
		// while loop
		while (count<101) {
			num=(int)(Math.random()*100);
		    System.out.println("Number random:"+ num);
		    count+=1;}
		System.out.println("I have read 100 integers~");
		input.close();
	
		  
		  
	}
	

}
