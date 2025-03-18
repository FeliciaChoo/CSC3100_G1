package LAB2;
/*Name:Choo En Yi
 * Lab:2
 * Date:18/10/2023
 * Qustion B: Calculate BMI
 */
import java.util.Scanner;
public class QuestionB {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);//create scanner object
		//read two inputs
		System.out.print("Enter body mass (kg):");
		double body_mass= input.nextDouble();
		System.out.print("Enter height(m):");
		double height= input.nextDouble();
		//Formula of BMI
		double ans= body_mass/(height*height);
		// Print output
		System.out.print("Your BMI is "+ ans);
		input.close();
		
	}

}
