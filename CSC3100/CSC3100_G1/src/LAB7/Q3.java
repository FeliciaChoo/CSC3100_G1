/*Name:Choo En Yi
 * Lab:7
 * Date:22/11/2023
 * Question 3: Display its corresponding number based on letter
 */
package LAB7;
import java.util.Scanner;
public class Q3 {
    public static void main(String[]args) {
    	Scanner input= new Scanner(System.in); // create a scanner object
    	
    	//Design the page
    	System.out.println("******************WELCOME TO THE MAPPING OF NUMBER FROM LETTER ENTER***************");
    	System.out.println("Please take note that the mapping is based on phone key pads~~~");
    	System.out.println("____________________________________________________________________________________");
    	
    	// Declare variable
    	String letter, letterUp;
    	char char1;
    
    	
    	
    	// Read input
    	System.out.print("Enter a letter:");
    	letter= input.nextLine();
    	
    	// if-else statement
    	if (letter.length()== 1 && Character.isLetter(letter.charAt(0))) {
    		letterUp= letter.toUpperCase();
    	    char1 = letterUp.charAt(0);
            if (char1=='A'||char1=='B'||char1=='C') { 
        
            	System.out.println("The corresponding number is 2 ");// Print output
    	}else if (char1=='D'||char1=='E'||char1=='F') {
            	
            	System.out.println("The corresponding number is 3 ");// Print output
    	}else if (char1=='G'||char1=='H'||char1=='I') { 
            	
            	System.out.println("The corresponding number is 4");// Print output
    	}else if (char1=='J'||char1=='K'||char1=='L') {
            	
            	System.out.println("The corresponding number is 5 ");// Print output
    	}else if (char1=='M'||char1=='N'||char1=='O') { 
            	
            	System.out.println("The corresponding number is 6 ");// Print output
    	}else if (char1=='P'||char1=='Q'||char1=='R'|| char1=='S') {
            	
            	System.out.println("The corresponding number is 7");// Print output
    	}else if (char1=='T'||char1=='U'||char1=='V') {
            	
            	System.out.println("The corresponding number is 8");// Print output
    	}else if (char1=='W'||char1=='X'||char1=='Y'||char1=='Z') {
            	
            	System.out.println("The corresponding number is 9");// Print output
            }else
            	System.out.println(letter +" is an invalid input.");
            	
            }
    	 else
         	System.out.println(letter +"is an invalid input.");
    	
    	//Design the page
    	System.out.println();
    	System.out.println("*******************************THANKS FOR USING*************************************");
    	System.out.println("Hope you enjoy it~~~");
    	System.out.println("____________________________________________________________________________________");
    	input.close();
    	
    }
}
