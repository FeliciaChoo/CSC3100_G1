/*Name:Choo En Yi
 * Lab:9
 * Date:13/12/2023
 * Question 3: Calculate the aveMark for whole students
 */
package LAB9;
import java.util.Scanner;
public class Q3 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		//Design
		 System.out.println("**********************COUNTING SYSTEM UPM******************");
		
		// Declare variables
		int num=0;
		double ttlMark=0.0;
		System.out.print("Enter total number of students:");
		num= input.nextInt();
		int count=1;
		// for loop
		for(count=1;count<=num;count++){
		// Read input
		System.out.println("Please enter marks for below categories. The number in the brackets()indicates tbe total marks");
		System.out.print("Assignment lab(60m):");
		double lab= input.nextDouble();
		System.out.print("Test 1(30m):");
		double test1= input.nextDouble();
		System.out.print("Test 2(40m):");
		double test2= input.nextDouble();
		System.out.print("Final Exam(60m):");
		double fExam= input.nextDouble();
		// Calculate total mark per student
		double mark= (lab/60*35+ test1/30*15+ test2/40*20+ fExam/60*30);
		System.out.printf("Total mark is %.2f",mark);
		System.out.println("");
		
		// if loop
		if (mark>=80 && mark<=100)
		     System.out.println("Grade:A");
		else if (mark>=75 && mark<=79)
		     System.out.println("Grade:A-");
		else if (mark>=70 && mark<=74)
			 System.out.println("Grade:B+");
		else if (mark>=65 && mark<=69)
			 System.out.println("Grade:B");
		else if (mark>=60 && mark<=64)
			 System.out.println("Grade:B-");
		else if (mark>=55 && mark<=59)
			 System.out.println("Grade:C+");
		else if (mark>=50 && mark<=54)
			 System.out.println("Grade:C");
		else if (mark>=45 && mark<=49)
			 System.out.println("Grade:C-");
		else if (mark>=40 && mark<=44)
			 System.out.println("Grade:D");
		else
			System.out.println("Grade:F");
		ttlMark+=mark;
	    input.close();
			
		} 
		 //Print output
   	    System.out.println("**********************CONCLUSION*************************");
        System.out.printf("The average mark for %1d student is %.2f",num, ttlMark/num);

       
	}
 
}
