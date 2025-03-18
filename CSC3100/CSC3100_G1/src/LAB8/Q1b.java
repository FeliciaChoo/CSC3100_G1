/*Name:Choo En Yi
 * Lab:8
 * Date:29/11/2023
 * Question 1b: Display total tuition fee according to semester, programme and credit hour
 */
package LAB8;
import java.util.Scanner;
public class Q1b {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in); //create a scanner object
		// Create design of the system
		System.out.println("*******************WELCOME TO UNIVERSITY OF CALLINEO********************************");
		System.out.println("**                                                                                **");
		System.out.println("**                                                                                **");
		System.out.println("**********************THANK YOU FOR CHOOSING US ************************************");
		System.out.println("Code:MS-Master in Security,MCS-Master of Computer Science,MDS-Master of Data Science");
		char response='y';
		//while loop
		while (response=='y'|| response=='Y') {
		//Declare variable
		String program="";
		int semFee=0;
		int creditFee=0;
		int totalTui=0;
		// Read input
		System.out.print("Name:");
		String name= input.nextLine();
		System.out.print("Matric number:");
		String matric= input.nextLine();
		System.out.print("Enter code:");
		String code= input.nextLine();

		System.out.print("Enter semester no(Please enter 1 or 2 ):");
		int semNo= input.nextInt();
		System.out.print("Enter total credit hour:");
		int creditHour= input.nextInt();
		input.nextLine();
		
		//if-else statement
		if (code.equals("MCS")||code.equals("mcs")) { // to accept upper and lower case
			program="Master of Computer Science";
			if (semNo==1){
		 semFee=1250;
		 creditFee=250;
		 totalTui=semFee+(creditHour*creditFee);}
			else if (semNo==2) {
		 semFee=1000;
		 creditFee=250;
		 totalTui=semFee+(creditHour*creditFee);}
			}
		else if (code.equals("MDS")||code.equals("mds")){// to accept upper and lower case
			program="Master of Data Science";

			if (semNo==1){
		 semFee=1400;
		 creditFee=250;
		 totalTui=semFee+(creditHour*creditFee);}// Calculate the total tuition fee

			else {
		 semFee=1100;
		 creditFee=250;
		 totalTui=semFee+(creditHour*creditFee);}// Calculate the total tuition fee
				
	}
		else if (code.equals("MS")||code.equals("ms")) { // to accept upper and lower case
	 program="Master in Security";

	 if (semNo==1){
		 semFee=1400;
		 creditFee=250;
		 totalTui=semFee+(creditHour*creditFee);}// Calculate the total tuition fee

	 else {
		 semFee=1100;
		 creditFee=250;
		 totalTui=semFee+(creditHour*creditFee);// Calculate the total tuition fee
		} 
}
	
		else {
	System.out.println("Please enter a valid code.");
	program="No programme found";

		
}

//Print output
System.out.println("__________________________________________________________________________________");
System.out.println("");
System.out.println("Dear "+ name+"("+ matric+")"+",");
System.out.println("Below is the details you need to know.");
System.out.println("Programme: "+ program);
System.out.println("Semester No: "+ semNo);
System.out.println("Credit Hours: "+creditHour );
System.out.println("Total tuition fee : RM"+ totalTui);

		// Ask the user if they want to continue
System.out.print("Do you to continue? (y/n): ");
response = input.next().charAt(0);
input.nextLine();}

 System.out.print("Thanks for using~ "); 
input.close();}

   




		
	}


