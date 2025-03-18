/*Name:Choo En Yi
 * Lab:5
 * Date:8/11/2023
 * Question 4: Display total tuition fee according to semester, programme and credit hour
 */
package Methods;
import java.util.Scanner;
public class Lab5Ex4 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); //create a scanner object
		Design();
		//Declare variable
		String name= ReadInput("Name:", input);
		String matric= ReadInput("Matric:", input);
		String code= ReadInput("Code:", input);
		int semNo=ReadInt ("Enter semester no(Please enter 1 or 2 ):", input);
		int creditHour= ReadInt ("Enter total credit hour:", input);
		String program= ShowProgram(code);
		int totalTui=Calculatettf( program,  semNo, creditHour);
		printOutput(name, matric, program, semNo,creditHour,totalTui);
	    input.close();
		
	}
				
		// Create design of the system
	   public static void Design() {
		System.out.println("*******************WELCOME TO UNIVERSITY OF CALLINEO********************************");
		System.out.println("**                                                                                **");
		System.out.println("**                                                                                **");
		System.out.println("**********************THANK YOU FOR CHOOSING US ************************************");
		System.out.println("Code:MS-Master in Security,MCS-Master of Computer Science,MDS-Master of Data Science");
	    }
	   // Read input
	   public static String ReadInput(String detail, Scanner input) {
		System.out.print(detail);
		return input.nextLine();
	   }
	   public static int ReadInt (String detail, Scanner input) {
		   System.out.print(detail);
		   return input.nextInt();
	   }
		
		//if-else statement
	   public static String ShowProgram(String code) {
		   String program="";
		   if (code.equals("MCS")||code.equals("mcs"))  // to accept upper and lower case
	   program="Master of Computer Science";
		   else if (code.equals("MDS")||code.equals("mds"))// to accept upper and lower case
       program="Master of Data Science";
		   else if (code.equals("MS")||code.equals("ms"))  // to accept upper and lower case
		program="Master in Security";
		   else {
		System.out.println("Please enter a valid code.");
		program="No programme found";}
		return program;
	   }
	   
 
 
	public static int Calculatettf(String program, int semNo, int creditHour) {
		int semFee=0;
		int creditFee=0;
		int totalTui=0;
		if (program.equals("Master of Computer Science")) {
			if (semNo==1){
				 semFee=1250;
				 creditFee=250;
				 totalTui=semFee+(creditHour*creditFee);}
			else if (semNo==2) {
				 semFee=1000;
				 creditFee=250;
				 totalTui=semFee+(creditHour*creditFee);}
			
		                 
		}
		if (program.equals("Master of Data Science")) {
			if (semNo==1){
				 semFee=1400;
				 creditFee=250;
				 totalTui=semFee+(creditHour*creditFee);}// Calculate the total tuition fee
			else {
				 semFee=1100;
				 creditFee=250;
				 totalTui=semFee+(creditHour*creditFee);}// Calculate the total tuition fee
						
			}
		
		if (program.equals("Master in Security")) {
			if (semNo==1){
				 semFee=1400;
				 creditFee=250;
				 totalTui=semFee+(creditHour*creditFee);}// Calculate the total tuition fee
			else {
				 semFee=1100;
				 creditFee=250;
				 totalTui=semFee+(creditHour*creditFee);// Calculate the total tuition fee
				} 
			
		}	return totalTui;	
		}
		
		//Print output
		 public static void printOutput(String name, String matric, String program,int semNo, int creditHour, int totalTui) {
		System.out.println("__________________________________________________________________________________");
		System.out.println("");
		System.out.println("Dear "+ name+"("+ matric+")"+",");
		System.out.println("Below is the details you need to know.");
		System.out.println("Programme: "+ program);
		System.out.println("Semester No: "+ semNo);
		System.out.println("Credit Hours: "+creditHour );
		System.out.println("Total tuition fee : RM"+ totalTui);
		System.out.println("");
		System.out.println("                     ~Thank you for using this system~");
		
		 }		
		
	}




