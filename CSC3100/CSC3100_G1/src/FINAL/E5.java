package FINAL;
import java.util.Scanner;
public class E5 {
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int []array=new int [10];
	        
 
	        System.out.println("Enter ten integers (enter 0 to end input):");

	        int evenCount = 0;
	        int oddCount = 0;

	        for (int i = 0; i < array.length; i++) {
	            array[i] = input.nextInt();

	            if (array[i] == 0) {
	                System.exit(0); // End input when 0 is encountered
	            }

	            if (array[i] % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        // Display results
	        System.out.printf("The number of odd numbers: %d%n", oddCount);
	        System.out.printf("The number of even numbers: %d%n", evenCount);

	        input.close();
	    }
	}

