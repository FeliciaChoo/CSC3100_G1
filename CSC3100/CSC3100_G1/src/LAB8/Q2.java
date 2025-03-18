/*Name:Choo En Yi
 * Lab:8
 * Date:29/11/2023
 * Question 2: Print the ticket charge with unspecified number of visitors
 */
package LAB8;
import java.io.IOException;
import java.util.Scanner;
public class Q2 {
	 public static void main (String[]args) throws IOException{
    	 Scanner input=new Scanner(System.in); // create a scanner object
    	 int response=1;
    	 
    	 while (response!=0) {
    	 //Declare variable
    	 String parkType="";
    	 int age=0;
    	 int ticketCharge=0;
    	 
    	 // Read input using switch
    	 System.out.println("Please enter code according to the park type you intereseted.");
    	 System.out.println("A:Fun Park");
    	 System.out.println("B:Water Park");
    	 System.out.println("C:Fun Park and Water Park");
    	 System.out.print("Code:");
    	 char ticket=(char)System.in.read();
    	// Read input age
    	 System.out.print("Enter age:");
    	 age= input.nextInt();
    	 switch (ticket) {
    	 case 'A': case'a': parkType= "Fun Park";
    	 if (age>58) 
			 ticketCharge=20;
		 else if (age>=21&& age<=58)
             ticketCharge=30;
		 else if (age>=13&& age<=20)
             ticketCharge=20;
		 else if (age>=4 && age<=12)
             ticketCharge=10;
		 else 
             ticketCharge=0;break;
    	 case 'B': case'b': parkType= "Water Park";
    	 if (age>58) 
			 ticketCharge=15;
		 else if (age>=21&& age<=58)
             ticketCharge=25;
		 else if (age>=13&& age<=20)
             ticketCharge=25;
		 else if (age>=4 && age<=12)
             ticketCharge=15;
		 else 
             ticketCharge=7;
    	 break;
    	 case 'C': case'c': parkType= "Fun Park and Water Park"; 
    	 if (age>58) 
			 ticketCharge=30;
		 else if (age>=21&& age<=58)
             ticketCharge=45;
		 else if (age>=13&& age<=20)
             ticketCharge=40;
		 else if (age>=4 && age<=12)
             ticketCharge=20;
		 else 
             ticketCharge=5;
    	 break;
    	 default:parkType= "Ticker for this park type is not found." ;
    	 ticketCharge=0;
    	 }
   
   
    	 //Print output
    	 System.out.println("**********************TICKET DETAILS****************");
    	 System.out.println("Ticket type:"+ parkType);
    	 System.out.println("Age:"+age);
    	 System.out.println("Ticket charge: RM"+ ticketCharge);
   
    	 System.out.print("Do you want to continue? (0 initiates stop):");
    	 response=input.nextInt();}
    	 System.out.println("Thank you for using~");
    	 input.close();
    	 

                 
     

    		 
    		 
    		 
    			 
    	 
     }
}


