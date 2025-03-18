package LAB2;
/*Name:Choo En Yi
 * Lab:2
 * Date:18/10/2023
 * Qustion D: Calculate total and gratuity 
 */
import java.util.Scanner;

public class QuestionD {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);//create a scanner object
		//Read the input
		System.out.print("Enter subtotal:RM");
		double subtotal= input.nextDouble();
		System.out.print("Enter gratuity rate(%):");
		double gra_rate=input.nextDouble();
		//Formula calculate gratuity rate and total
		double gratuity= subtotal*gra_rate/100;
		double total= subtotal+gratuity;
		//print output
		System.out.println("The total is RM"+total);
		System.out.print("The gratuity is RM"+ gratuity);
		input.close();
		
		
		
		
	}

}
