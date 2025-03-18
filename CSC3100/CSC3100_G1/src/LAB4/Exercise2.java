package LAB4;
/*Name:Choo En Yi
 * Lab:4
 * Date:1/11/2023
 * Qustion 2: Display discount according to quantity 
 */
import java.util.Scanner;
public class Exercise2 {
	public static void main(String[]args) {
	Scanner input= new Scanner(System.in); // create scanner object
	// Read input
	System.out.print("Enter quantity:");
	int Quantity= input.nextInt();
	
	//if-else statement
	if (Quantity==2)
		System.out.println("Discount:10%");
	else if (Quantity==4)
		System.out.println("Discount:20%");
	else if (Quantity>5)
		System.out.println("Discount:50%");
	else
		System.out.println("No Discount");
	input.close();
	}
}
