package FINAL;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int noStd = input.nextInt();

        double[] array = new double[noStd];
        System.out.print("Enter " + noStd + " scores:");

        // Initialize max outside of the loop
        double max = array[0];

        for (int i = 0; i < noStd; i++) {
            array[i] = input.nextDouble();
            
            // Check and update max inside the loop
            if (max < array[i]) {
                max = array[i];
            }
        }

        // Assign grades and display results
        for (int i = 0; i < noStd; i++) {
            char grade;
            if (array[i] >= max - 5) {
                grade= 'A';
            } else if (array[i]  >= max - 10 &&array[i] <= max - 5 ) {
                grade= 'B';
            } else if (array[i]  >= max - 15 && array[i]  <= max - 10) {
            	grade= 'C';
            } else if (array[i]  >= max - 20 && array[i]  <= max - 15) {
            	grade= 'D';
            } else {
            	grade= 'F';
            }
            System.out.printf("Student %d score is %.2f and grade is %c%n", i, array[i], grade);
    }
    input.close();
            
            
        }
}
 

 
        
