package LAB2;
/*Name:Choo En Yi
 * Lab:2
 * Date:18/10/2023
 * Qustion C: Inches convert to meter
 */
import java.util.Scanner;
public class QuestionC {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);//create scanner object
		//read  input
		System.out.print("Enter a number in inches:");
		double inches= input.nextDouble();
		// Formula convert inches to meter
		double meter=inches*0.0254;
		//print output
		System.out.print("The answer is "+ meter+ "m");
		input.close();
		
	}
	

}
