/*Name:Choo En Yi
 * Lab:9
 * Date:13/12/2023
 * Question 4: Calculate the aveMark for whole students
 */
package LAB9;
import java.util.Scanner;
public class Q4 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in); //create new scanner object
		//Declare variable
		int num=1;double price=0.0; double ttlPrice=0.0;char ticket='Y';char visit='Y';
		// Design
		System.out.println("************WELCOME TO ZOO NEGARA*************");
		do {
		System.out.println("------------------VISIOR "+ num+"--------------------");
		// Read input
		System.out.print("Enter your nationality:(M|Malaysian /F|Foreinger):");
		char nation=input.next().charAt(0);
		do {
		if (nation=='M'|| nation=='m') {
			char category;
			do {
			System.out.print("Enter your category(A|Adult/ C|Children/ S|Senior):");
			category=input.next().charAt(0);
			if (category=='A' || category=='a') 
				 price=43;
			else if (category=='C' || category=='c') 
				 price=16;
			else if (category=='S' || category=='s') 
			     price=21;
			else
				System.out.println("Please enter a valid category.");
			} while(!(category=='A'|| category=='a'||category=='C'|| category=='c'||category=='S'|| category=='s'));
			System.out.print("Number of tickets:");
			int qty=input.nextInt();
			double sum=price*qty;
			ttlPrice+=sum;
			System.out.print("Total charge of Type "+Character.toUpperCase(category)+" ticket is RM"+ sum);
			System.out.print("\nBuy another ticket?(Y/N):");
		    ticket=input.next().charAt(0); 
			}
		else if(nation=='F'|| nation=='f') {
			char part;
			do {
			System.out.print("From which part?(I|Kad,Working Permit, Dependent Past /E|Asean/ O|Others):");
			 part= input.next().charAt(0);
			if (part=='I'|| part=='i') {
			char category;
				do {
			System.out.print("Enter your category(A|Adult/ C|Children/ S|Senior):");
			 category=input.next().charAt(0);
			if (category=='A' || category=='a') 
				 price=50;
			else if (category=='C' || category=='c') 
				 price=25;
			else if (category=='S' || category=='s') 
			     price=50;
			else
				System.out.println("Please enter a valid category.");
				} while (!(category=='A'|| category=='a'||category=='C'|| category=='c'||category=='S'|| category=='s'));
			System.out.print("Number of tickets:");
			int qty=input.nextInt();
			double sum=price*qty;
			ttlPrice+=sum;
			System.out.print("Total charge of Type "+Character.toUpperCase(category)+" ticket is RM"+ sum);
			System.out.print("\nBuy another ticket?(Y/N):");
		    ticket=input.next().charAt(0); }
			else if (part=='E'|| part=='e') {
				char category;
				do {
				System.out.print("Enter your category(A|Adult/ C|Children/ S|Senior):");
				 category=input.next().charAt(0);
				if (category=='A' || category=='a') 
					 price=61;
				else if (category=='C' || category=='c') 
					 price=33;
				else if (category=='S' || category=='s') 
				     price=61;
				else
					System.out.println("Please enter a valid category.");
				} while (!(category=='A'|| category=='a'||category=='C'|| category=='c'||category=='S'|| category=='s'));
				System.out.print("Number of tickets:");
				int qty=input.nextInt();
				double sum=price*qty;
				ttlPrice+=sum;
				System.out.print("Total charge of Type "+category+" ticket is RM"+ sum);
				System.out.print("\nBuy another ticket?(Y/N):");
			    ticket=input.next().charAt(0); }
			else if (part=='O'|| part=='o') {
			    System.out.println("\nEnter your category(A|Adult/ C|Children/ S|Senior):");
				char category;
				do {
				category=input.next().charAt(0);
				if (category=='A' || category=='a') 
					 price=82;
				else if (category=='C' || category=='c') 
					 price=43;
				else if (category=='S' || category=='s') 
				     price=82;
				else
					System.out.println("Please enter a valid category.");
				} while (!(category=='A'|| category=='a'||category=='C'|| category=='c'||category=='S'|| category=='s'));
				System.out.println("Number of tickets:");
				int qty=input.nextInt();
				double sum=price*qty;
				ttlPrice+=sum;
				System.out.println("Total charge of Type "+category+" ticket is RM"+ sum);
				System.out.println("\nBuy another ticket?(Y/N):");
			    ticket=input.next().charAt(0); }
			else
				System.out.println("Please enter a valid category.");
		  } while (!(part=='I'|| part=='i'||part=='E'|| part=='e'||part=='O'|| part=='o'));}
		
			
		 }while ( ticket=='Y'|| ticket=='y');
		System.out.print("\nThe total payment for VISITOR "+ num+ " is RM"+ttlPrice);
		System.out.print("\nEnter another visitor(Y/N)?:");
		visit=input.next().charAt(0);
		num++;
	     } while ( visit=='Y'|| visit=='y');
		input.close();
		
	}
}









	
		
		


		
		
		
	


