package PracticeT6;
import java.util.Scanner;
public class LastPaperQ2 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in) ; // create a new scanner object
		// Declare variables
		int count, noStd=0, notp1=0,notp2=0,notp3=0,notp4=0,notp5=0, noSub=0;
		double tpSc=0.0,ttlSc=0;
		
		// Read variables
		System.out.print("-----TP CALCULATION-----");
		System.out.print("\nEnter total number of students:");
		noStd=input.nextInt();
		for(count=1; count<=noStd; count++) {
		System.out.print("\nEnter name:");
		String name=input.next();
		System.out.print("Enter total subjects:");
		noSub=input.nextInt();
		System.out.print("Enter total scores:");
		ttlSc=input.nextDouble();
		tpSc=ttlSc/noSub;
		if (tpSc>=80&&tpSc<=100) {
			System.out.printf("Student %s TP is %.2f -TP5",name.toUpperCase(),tpSc);
			notp5++;}
		else if (tpSc>=60&&tpSc<=79) {
			System.out.printf("Student %s TP is %.2f -TP4",name.toUpperCase(),tpSc);
			notp4++;}
		else if (tpSc>=40&&tpSc<=59) {
			System.out.printf("Student %s TP is %.2f -TP3",name.toUpperCase(),tpSc);
			notp3++;}
		else if (tpSc>=20&&tpSc<=39) {
			System.out.printf("Student %s TP is %.2f -TP2",name.toUpperCase(),tpSc);
			notp2++;}
		else if (tpSc>=0&&tpSc<=19) {
			System.out.printf("Student %s TP is %.2f -TP1",name.toUpperCase(),tpSc);
			notp1++;}
		else {
			System.out.println("Please enter valid score.");}
		System.out.print("\n--------------------------------------------");
		}
	    System.out.println("\nThe number of students based on TP category");
		System.out.println("TP5-"+ notp5);
		System.out.println("TP4-"+ notp4);
		System.out.println("TP3-"+ notp3);
		System.out.println("TP2-"+ notp2);
		System.out.println("TP1-"+ notp1);
		input.close();
	}
	

}
