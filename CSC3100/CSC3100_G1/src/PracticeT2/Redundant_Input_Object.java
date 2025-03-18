package PracticeT2;
import java.util.Scanner;
public class Redundant_Input_Object {
	public static void main(String[]args) {
		    Scanner scanner = new Scanner(System.in);
				System.out.println("Enter an integer:");
		        int v1= scanner.nextInt();
				scanner.nextLine(); //Consume the newline character
				System.out.println("Enter a double value:");
				double v2= scanner.nextDouble();
				scanner.nextLine(); //Consume the newline character
			    
			    System.out.println("Enter radius:");
			    double radius= scanner.nextDouble();
			    scanner.nextLine(); //Consume the newline character
			    
			    System.out.println("Enter the area:");
			    double area=scanner.nextDouble();
			    scanner.nextLine(); //Consume the newline character
			    scanner.close();
			    double sum= v1+v2-radius+area;
			    System.out.println("The sum is "+sum);
			    
	}
		}
	


