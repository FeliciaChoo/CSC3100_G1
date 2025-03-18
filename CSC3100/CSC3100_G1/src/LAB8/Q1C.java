/*Name:Choo En Yi
 * Lab:8
 * Date:29/11/2023
 * Question 1c: Display all the numbers that is located between two entered numbers
 */
package LAB8;
import java.util.Scanner;
public class Q1C {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		
		// Display variables
		int num1=0, num2=0, num=0;
		char response='y';
		
		// While loop
		while (response=='Y'|| response== 'y') {
		  // read input
		System.out.print("Enter integer 1:");
		num1= input.nextInt();
		System.out.print("Enter integer 2:");
		num2= input.nextInt();
		if (num1> num2) {
			System.out.print("Numbers in descending order:");
			num=num1;
			while(num>=num2) {
			System.out.print(num+" ");
			num--;}
		}
		else if(num1< num2) {
			num=num1;
			System.out.print("Numbers in ascending order:");
			while (num<=num2) {
			System.out.print(num+" ");
			num++;}
		}
		else 
			System.out.println("Both integers are equal.");
		
		// Ask to continue
		input.nextLine();
		System.out.println("");
		System.out.println("Do you want to continue(y/n)?");
		response=input.next().charAt(0);}
		input.close();
		System.out.println("Thank you for using!");
	}

}
