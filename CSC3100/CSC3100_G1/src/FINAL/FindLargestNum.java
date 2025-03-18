package FINAL;
import java.util.Scanner;
public class FindLargestNum {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double[] numbers = new double[10];

	        System.out.println("Enter ten numbers:");
	        for (int i = 0; i < 10; i++) {
	            numbers[i] = input.nextDouble();
	        }

	        double maxNumber = max(numbers);

	        System.out.printf("The maximum number is: %.2f%n", maxNumber);

	        input.close();
	    }

	    public static double max(double[] array) {
	        if (array.length == 0) {
	            throw new IllegalArgumentException("Array is empty");
	        }

	        double max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    }
	}


