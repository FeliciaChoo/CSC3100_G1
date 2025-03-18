/*Name:Choo En Yi
 * Lab:10
 * Date:3/1/2023
 * Question 3: Calculate total price
 */
package LAB10;
import java.util.Scanner;
public class Q3 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in); // create a scanner object
		char ctn='y';
		do {
		System.out.print("Enter student name:");
		String name= input.nextLine();
		double q1=readInput("Enter mark for Quiz1:", input);
		double q2=readInput("Enter mark for Quiz2:", input);
		double q3=readInput("Enter mark for Quiz3:", input);
		double avQ=countAvg(q1,q2,q3);
		System.out.printf("The average for 3 quizzes is %.2f\n",avQ);
		double a1=readInput("\nEnter mark for Assignment1:", input);
		double a2=readInput("Enter mark for Assignment2:", input);
		double avA=countAvg(a1,a2);
		System.out.printf("The average for 2 assignments is %.2f\n",avA);
		double mT=readInput("\nEnter mark for Mid-Term Exam Mark:", input);
		double fE=readInput("Enter mark for Final Exam Mark:", input);
		double ttlMark=calcTtlM(avQ,avA,mT,fE);
		char grade= calcGrade(ttlMark);
		display(name,ttlMark,grade);
		System.out.println("More grade computation? y/n:");
		ctn=input.next().charAt(0);
		input.nextLine();
	}while (ctn=='y'|| ctn=='Y');
		
	}
public static double readInput(String detail, Scanner input) {
	   System.out.print(detail);
	   return input.nextDouble();
	   
}
public static double countAvg(double q1, double q2, double q3) {
	 double avg=(q1+q2+q3)/3;
	 return avg;
}
public static double countAvg(double a1, double a2) {
	 double avg=(a1+a2)/2;
	 return avg;
}
public static double calcTtlM(double avQ, double avA, double mT, double fE) {
	double ttlM= (avQ*0.15+ avA*0.25+mT*0.2+fE*0.4);
	return ttlM;
}
public static char calcGrade(double ttlMark) {
	if (ttlMark>79 && ttlMark<101)
		return 'A';
	else if (ttlMark>69 && ttlMark<80)
		return 'B';
	else if (ttlMark>54 && ttlMark<70)
		return 'C';
	else if (ttlMark>44 && ttlMark<55)
		return 'D';
	else
		return 'F';
}
public static void display(String name,double ttlMark, char grade) {
	System.out.printf("%s , your final mark for CSC3100 is %.2f and grade %c\n", name, ttlMark, grade);	
}
}
