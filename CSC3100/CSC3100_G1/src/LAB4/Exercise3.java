package LAB4;
/*Name:Choo En Yi
 * Lab:4
 * Date:1/11/2023
 * Qustion 3: Display course name according to code 
 */
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);// create scanner object
		// Read input
		System.out.print("Enter code:");
		int Code= input.nextInt();
		
		//if-else statement
		if (Code==480)
			System.out.println("Multimedia");
		else if (Code==481)
		    System.out.println("Computer System");
		else if (Code==482)
		    System.out.println("Software Engineering");
		else if (Code==483)
		    System.out.println("Computer Network");
		else
			System.out.println("Code is not found");
		input.close();
		
		
	}

}
