/*Name:Choo En Yi
 * Lab:5
 * Date:8/11/2023
 * Question 3: Display price,discount price and price after discounted
 */
package LAB5;
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		
		// Declare variables
		double price= 0.0;
		int quantity=0;
		double dis=0.0;
		double disPrice=0.0;
		
		// Read input
		System.out.print("Enter total price: RM");
		price= input.nextDouble();
		System.out.print("Enter total quantity:");
		quantity= input.nextInt();
		
		// if-else statement
		if (price>=20&& price<=99.99) {
			if (quantity>=10 && quantity<=50)
				dis=2.11;
		    else if (quantity>50)
		    	dis= 5.11;
		    else
		    	dis=0;
		}
		else if (price>=100.00) {
			if (quantity>=10 && quantity<=50)
				dis=7.11;
		    else if (quantity>50)
		    	dis= 11.11;
		    else
		    	dis=0;
		}
		
		// Calculate price after discount
		disPrice= price*(1-(dis/100));
		
		//Print output
	    System.out.println("--------------------RECEIPT--------------");
	    System.out.println("Total Price:RM"+ price);
	    System.out.println("Total Quantity:"+ quantity);
	    System.out.println("Total Discount:"+ dis+ "%");
	    System.out.printf("Total Price after discount: RM%.2f%n",disPrice);
	    
	    input.close();
		    		
		    
		
	}

}
