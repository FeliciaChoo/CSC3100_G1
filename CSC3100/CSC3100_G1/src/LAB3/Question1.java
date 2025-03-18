package LAB3;
/*Name:Choo En Yi
 * Lab:3
 * Date:25/10/2023
 * Qustion 1: Calculate total tuition fees
 */
import java.util.Scanner;
public class Question1 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); //create a scanner object
		//Read input course1
		System.out.print("Enter code of the course 1:");
		String code1=input.nextLine();
		System.out.print("Enter the name of the course 1:");
		String sub1=input.nextLine();
		System.out.print("Enter the total credit hour of the course 1:");
		int cre1= input.nextInt();
		input.nextLine(); // consume new line character
		
		//Read input course2
		System.out.print("Enter code of the course 2:");
		String code2=input.nextLine();
		System.out.print("Enter the name of the course 2:");
		String sub2=input.nextLine();
		System.out.print("Enter the total credit hour of the course 2:");
		int cre2= input.nextInt();
		input.nextLine(); // consume new line character
		
		//Read input course3
		System.out.print("Enter code of the course 3:");
		String code3=input.nextLine();
		System.out.print("Enter the name of the course 3:");
		String sub3=input.nextLine();
		System.out.print("Enter the total credit hour of the course 3:");
		int cre3= input.nextInt();
		input.nextLine(); // consume new line character
		
		//Calculate total tuition fee
		double TotalTuitFee=(cre1+cre2+cre3)*120;
		
		// Print the output
		System.out.println("The code of courses you register:"+code1+","+code2+","+code3);
		System.out.println("The name of courses you register:"+sub1+","+sub2+","+sub3);
		System.out.println("The total credit hour for all the courses:"+(cre1+cre2+cre3));
		System.out.println("The total tuition fee:RM"+TotalTuitFee);
				
	input.close();	
		
	}
	
	

}
