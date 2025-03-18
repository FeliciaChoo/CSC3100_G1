package LAB13;
import java.util.Scanner;
public class Q2 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in); //create new scanner object
		int numE=readNumOfElem("Enter the quantity of floating-point numbers:", input);
		double[]numArray=readNumbers(input, numE);
		double avg=calcAverage(numArray);
		int numL=countAboveAverage(numArray,avg);
		printResult( avg,  numL,  numE);
	}
	public static int readNumOfElem(String details,Scanner input) {
		System.out.print(details);
		return input.nextInt();
	}
	public static double[] readNumbers(Scanner input, int numE) {
		System.out.println("Please enter "+numE+ " floating-point numbers:");
		double[]numArray= new double[numE];
		for (int i=0; i<numE; i++) {
			System.out.println("Enter floating-point numbers:");
			numArray[i]= input.nextDouble();	
		}
		return numArray;
	}
	public static double calcAverage(double[]numArray) {
		double sum=0;
		for (int i =0; i<numArray.length ; i++) {
			sum+=numArray[i];
			
		}
		double avg=sum/numArray.length;
		return 	avg;	
	}
	public static int countAboveAverage(double[]numArray, double average) {
		int numLg=0;
	    for (int i=0; i<numArray.length; i++) {
			if (numArray[i]>average)
				numLg++;	
		}return numLg;
	}
	public static void printResult(double avg, int numL, int numE) {
		System.out.printf("The average for %d floating-point numbers is %.2f\n",numE, avg);
		System.out.println("The number of floating-point numbers that is larger than average is "+ numL);
		
	}
}

