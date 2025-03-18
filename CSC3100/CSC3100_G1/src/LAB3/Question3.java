package LAB3;
/*Name:Choo En Yi
 * Lab:3
 * Date:25/10/2023
 * Qustion 3: Receipt of 2 items
 */
import java.util.Scanner; 
public class Question3 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);// create a scanner object
		
		// Read input item1
		System.out.print("Enter item 1:");
		String item1=input.nextLine();
		System.out.print("Enter Quantity:");
		int Quantity1=input.nextInt();
		System.out.print("Enter Unit Price:RM");
		double UnitPrice1=input.nextDouble();
		input.nextLine(); // consume newline character
		
		//Read input item2
		System.out.print("Enter item 2:");
		String item2=input.nextLine();
		System.out.print("Enter Quantity:");
		int Quantity2=input.nextInt();
		System.out.print("Enter Unit Price:RM");
		double UnitPrice2=input.nextDouble();
		input.nextLine(); // consume newline character
		
		// Formula of calculation amount of each item
		double Amount1=Quantity1*UnitPrice1;
		double Amount2=Quantity2*UnitPrice2;
		
		//Formula of calculation of subtotal
		double SubTotal=Amount1+Amount2;
		
		// Formula of calculation government tax and service charge
		double GovTax= SubTotal*6/100;
		double ServCharge=SubTotal*10/100;
		
		//Formula of calculation of total
		double Total=SubTotal+GovTax+ServCharge;
		
		//Format to two decimal places using String.format
		String formattedAmount1=String.format("%.2f",Amount1);
		String formattedAmount2=String.format("%.2f",Amount2);
		String formattedSubTotal=String.format("%.2f",SubTotal);
		String formattedGovTax=String.format("%.2f",GovTax);
		String formattedTotal=String.format("%.2f",Total);
		
		//Create details of receipt
				System.out.println("                                  RECEIPT");
				System.out.println("_________________________________________________________________________");
				System.out.println("Store:100 SpeedyMart");
				System.out.println("Store number:123-456-789, Manager: Lim");
				System.out.println("Adress:Unist Sr.54, Uljd Gan, Serdang");
				System.out.println("25/10/2023, 21:20");
				System.out.println("=========================================================================");
				System.out.println("Items               Unit Price          Quantity           Total Price ");
				System.out.println("=========================================================================");
		
		//print output
				System.out.println(item1+"                 "+UnitPrice1+"                    "+Quantity1+"                     "+formattedAmount1);
				System.out.println(item2+"                  "+UnitPrice2+"                   "+Quantity2+"                     "+formattedAmount2);
				System.out.println("__________________________________________________________________________");
				System.out.println("Total price before tax                                             "+formattedSubTotal);
				System.out.println("                              "+ "Government Tax(6%)                   "+formattedGovTax);
				System.out.println("                              "+ "Service Charge(10%)                  "+ServCharge);
				System.out.println("                            _______________________________________________");
				System.out.println("Total price                                                        "+formattedTotal);
				System.out.println("__________________________________________________________________________");
				System.out.println("*****************************Thanks for coming**************************** ");
		input.close();		

		
		
		
		
	}

}
