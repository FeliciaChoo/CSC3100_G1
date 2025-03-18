/*Name:Choo En Yi
 * Lab:9
 * Date:13/12/2023
 * Question 1: Calculate retail price
 */
package LAB9;
import java.util.Scanner;
public class Q1 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);//create a scanner object
		//Declare variables
		int num=0;
		int qty=0;
		double price=0.0;
		double tPrice=0.0;
		int count=1;
		
		//Design
		System.out.println("***************Welcome to Accessories shop*******************");
		System.out.println("Please enter the code based on the product you are interested");
		System.out.println("1:RM2.98");
		System.out.println("2:RM4.50");
		System.out.println("3:RM9.98");
		System.out.println("4:RM4.49");
		// Read input
		do {
		  System.out.print("Product:");
		  num=input.nextInt();
		  System.out.print("Quantity:");
		  qty=input.nextInt();
		  
		  switch(num) {
		  case 1: price=2.98;break;
		  case 2: price=4.50;break;
		  case 3: price=9.98;break;
		  case 4: price=6.87;break;
		  default: System.out.println("Product is not found.");}
		  
		  System.out.println("Total price is RM"+price*qty);
		  tPrice+=(price*qty);
		  System.out.print("Do you want to stop? (0 signifies stop):");
		  count=input.nextInt();
		  input.close();
		  
		  
		}while(count!=0);
		System.out.printf("///Total price for all product is RM%.2f",tPrice);
		
		
		
	}

}
