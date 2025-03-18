package PracticeT6;
import java.util.Scanner;
public class probSolv {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create scanner object
		// declare variables
		
		int test1=0, test2=0, test3=0, test4=0, aveScore=0;
		// design
		System.out.print("Enter total number of students: ");
		int num=input.nextInt();
	    for (int count=1; count<=num;count++) {
	    	System.out.println("*********STUDENT"+ count+ "**********");
	    	System.out.print("Enter test 1:");
	    	test1=input.nextInt();
	    	System.out.print("Enter test 2:");
	    	test2=input.nextInt();
	    	System.out.print("Enter test 3:");
	    	test3=input.nextInt();
	    	System.out.print("Enter test 4:");
	    	test4=input.nextInt();
	    	aveScore= (test1+test2+test3+test4)/4;
	    	if (aveScore<50)
	    	   System.out.println("Result: Fail");
	    	else 
	    	   System.out.println("Result: Pass");
	    	System.out.println("____________________________________");
	    	
	    		   
	    	 
	    	
	    }
		System.out.println("Thank you for using~");
		input.close();
	}
	

}
