package LAB2;
/*Name:Choo En Yi
 * Lab:2
 * Date:18/10/2023
 * Qustion A: Calculate sum of two integers
 */
import java.util.Scanner;
public class QuestionA {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);//create scanner object
		//read two numbers
		System.out.print("Enter first integer:");
		int num1= input.nextInt();
		System.out.print("Enter second integer:");
		int num2= input.nextInt();
		int sum=num1+num2; //formula of sum
		System.out.println("The sum of two integers is "+sum);
		input.close();
		
	}
	
 
}
