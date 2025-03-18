/*Name:Choo En Yi
 * Lab:8
 * Date:29/11/2023
 * Question 1: Reads 100 random integer numbers
 */
package LAB8;
import java.io.IOException;
import java.util.Scanner;
public class Q1 {
		public static void main(String[]args) throws IOException{
			Scanner input= new Scanner(System.in); // create a scanner object
			
			char response ='y';
			//while loop
			while  (response == 'y' || response == 'Y') {
			// Declare variables
			double height=0.0;
			double weight=0.0;
			double waist=0.0;
			String gender="";
			double BMI= 0.0;
			String status="";
			String hStatus="";
			
			// Read input
			System.out.print("Enter height(m):");
			height= input.nextDouble();
			System.out.print("Enter weight(kg):");
			weight= input.nextDouble();
			System.out.print("Enter waist size(inches):");
			waist= input.nextDouble();
			System.out.print("Enter gender:");
			input.nextLine();
			gender= input.nextLine();
			char ch= gender.charAt(0);
		
			
			// Calculate BMI
			BMI= weight/ (height*height);
			
			// if-else statement for BMI Status
			if (BMI>= 18.5 && BMI<=24.9)
				status="normal";
			else if (BMI>= 25 && BMI<=29.9)
				status="overweight";
			else if (BMI>= 30 && BMI<=34.9)
				status="obese";
			else if (BMI>= 35 && BMI<=39.9)
				status="severly obese";
			else
				status= "morbidly obese";
			
			//case logic structure for health status
			switch (ch) {
			case'F':
			   if (waist>35)
				   hStatus="Higher risk for heart disease and Type 2 diabetes.";
			  else
				   hStatus="Good life style!" ;
		    break;
			
			case'M':
				 if (waist>40)
					   hStatus="Higher risk for heart disease and Type 2 diabetes.";
				  else
						hStatus="Good life style!" ;
				 
			break;
			default: System.out.println("Please ender a valid gender.");
			hStatus="Invalid";
			
			}
				   
			// Print output
			System.out.println("____________________________________________________________");
			System.out.println("*******************BMI and Health Status********************");
			System.out.println("Gender:"+ gender);
			System.out.println("Height:"+ height+"m");
			System.out.println("Weight(kg):"+ weight+"kg");
			System.out.println("Waist size(inches):"+ waist+"inches");
			System.out.printf("BMI:%.2f%n", BMI);
			System.out.println("Your BMI status is "+ status);
			System.out.println("Health Status:"+ hStatus);
			
			
			// Ask the user if they want to continue
            System.out.print("Do you to continue? (y/n): ");
            response = input.next().charAt(0);}
			
			 System.out.print("Thanks for using~ "); 
			input.close();
        }
		}

		

	

	

