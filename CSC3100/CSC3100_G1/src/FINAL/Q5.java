package FINAL;
import java.util.Scanner;
public class Q5 {
	public static void main(String[]args) {
		int noPass=0;
		for (int i=1; i<4; i++) {
		Scanner input=new Scanner(System.in);
		System.out.print("Student "+ i+ " Input for MidTerm, Lab, and Final Exam:");
		double midTerm= input.nextDouble();
		double lab=input.nextDouble();
		double examF=input.nextDouble();
		double ttlmark=calcMark(midTerm,lab,examF);
		char grade= determineGrade(ttlmark);
		 noPass= calcPassStudent(noPass,ttlmark);
		printInfo(i,ttlmark,grade);	
		
}
    System.out.print("Total Pass is : "+ noPass);
}
public static double calcMark(double midterm, double lab, double exam) {
	double ttlMark=0.0;
	ttlMark= (midterm+lab+exam);
	return ttlMark;
	
	
	
}
public static char determineGrade(double totalMark) {
	if (totalMark>=80 && totalMark<=100)
		return 'A';
	else if (totalMark>=60 && totalMark<=79)
		return 'B';
	else if (totalMark>=50 && totalMark<=59)
		return 'C';
	else if (totalMark>=40 && totalMark<=49)
		return 'D';
	else if (totalMark>=0 && totalMark<=39)
		return 'F';
	return 0;
}
public static int calcPassStudent(int totalPass,double totalMark) {

	if (totalMark>=50)
		totalPass+=1;
	return totalPass;
	
}
public static void printInfo(int num, double totalMark, char grade) {
	System.out.printf("Student %d result is %.2f , %c\n", num, totalMark, grade);
}
}