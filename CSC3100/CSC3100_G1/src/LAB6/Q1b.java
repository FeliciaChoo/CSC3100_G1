/*Name:Choo En Yi
 * Lab:6
 * Date:15/11/2023
 * Question 1b: Display string
 */
package LAB6;
import java.util.Scanner;
public class Q1b {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in); // create a scanner object
		
		//Declare variables
		String str="";
		String str1="";
		String str2="";
		String str3="do";
		String str4="";
		
		
		System.out.print("Enter string:");
		str= input.nextLine();
		if (str.length()>=10) {
		  str1= str.substring(3,6).toUpperCase(); 
		  str2= str1+ "let's do the program!";
		  System.out.println(str2);
		  if (str2.contains(str3))
			System.out.println("Yes!!! Your message contains \"do\" string");
		    str4=str2.replace("do","make");
		    System.out.println(str4);
		    System.out.println("The total length of the string: "+ str4.length());
		    
		  }
		  
	    else
	    	System.out.println("Enter a longer string.");
		
		input.close();
	}
     
}
