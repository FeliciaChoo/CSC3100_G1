package Array;
import java.util.Scanner;
public class WithoutArray {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in); // create a scanner object
		int num=0;
		System.out.print("Enter first integer:");
		int num1=input.nextInt();
		System.out.print("Enter second integer:");
		int num2=input.nextInt();
		System.out.print("Enter third integer:");
		int num3=input.nextInt();
		System.out.print("Enter fourth integer:");
		int num4=input.nextInt();
		System.out.print("Enter fifth integer:");
		int num5=input.nextInt();
		input.close();
		// calculate average
		double avg=(num1+num2+num3+num4+num5)/5.0;
		
		//calculate number are above average
		if (avg<num1)
			num++;
		if (avg<num2)
			num++;
		if (avg<num3)
			num++;
		if (avg<num4)
			num++;
		if (avg<num5)
			num++;
		
		System.out.printf("The average of five integers is %.2f and the numbers above the average is %d\n", avg,num);
		
	}

}
