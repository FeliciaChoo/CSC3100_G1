package LAB3;
/*Name:Choo En Yi
 * Lab:3
 * Date:25/10/2023
 * Qustion 2: Calculate the total mark
 */
import java.util.Scanner;
public class Question2 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);//create a scanner object
		//Read input
		System.out.println("******************CSC3100***********************");
		System.out.print("Name:");
		String name= input.nextLine();
		System.out.print("Matric number:");
		int matric=input.nextInt(); 
		System.out.print("Enter marks in Assessment1:");
		double Assem1= input.nextDouble();
		input.nextLine();// consume newline character
		System.out.print("Enter marks in Assessment2:");
		double Assem2= input.nextDouble();
		input.nextLine();// consume newline character
		System.out.print("Enter marks in Lab Assignment:");
		double LabAssign= input.nextDouble();
		input.nextLine();// consume newline character
		System.out.print("Enter marks in Final Exam:");
		double FinalEx= input.nextDouble();
		input.nextLine();// consume newline character
		
		//Calculate total marks
		double TotalMark=Assem1+Assem2+LabAssign+FinalEx;
		
		//Print output
		System.out.println(name+"("+matric+"):"+"Your total marks is  "+TotalMark+"%");
		input.close();
		
		
	}

}
