/*Name:Choo En Yi
 * Lab:9
 * Date:13/12/2023
 * Question 2: Calculate hotel price
 */
package LAB9;
import java.util.Scanner;
public class Q2 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a new scanner
		// Declare variables
		int count=1;
		double price=0.0;
		double ttlPrice=0.0;
		// Design
		System.out.println("*****************Welcome to ABC Hotel**************");
		System.out.println("Please enter the details below before you proceed.");
		System.out.print("Age:");
		int age= input.nextInt();
		System.out.print("Are you vaccinated? (Y/N):");
		char vac=input.next().charAt(0);
		if (age>17 && (vac=='y'||vac=='Y')) {
			System.out.print("How many bookings(s):");
		    int numBook=input.nextInt();
		    System.out.println("Enter"+numBook+ "bookings(s) information:");
	    	System.out.println("Deluxe(D/d) Superior(S/s) Executive(E/e)");
		    while (count<= numBook) {
		    	System.out.println("*****************************************");
		    	System.out.println("Booking"+count);
		    	System.out.print("Enter name:");
		    	String name= input.next();
		    	System.out.print("Enter room code:");
		    	char code=input.next().charAt(0);
		    	switch (code) {
		    	case 'D': case 'd': price=330;break;
		    	case 'S': case 's': price=390;break;
		    	case 'E': case 'e': price=480;break;
		    	default: System.out.println("Please enter a valid code.");
		    	}
		    	System.out.print("Enter number of days:");
		    	int day= input.nextInt();
		    	double bill=  price*day;
		    	System.out.println(name+" Bill:RM"+bill);
		    	ttlPrice+=bill;
		    	count++;
		    	
		    input.close(); 	
		    }System.out.println("*****************************************");
		    System.out.println("Total Bill:RM"+ttlPrice);
		    System.out.println("Thank you! Have a nice day!");
			
		}
		   
		
	}
}
