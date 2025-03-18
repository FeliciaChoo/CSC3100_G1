package FINAL;
import java.util.Scanner;
public class E8 {
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Test with integers
	        int[] intArray = new int[10];
	        System.out.println("Enter 10 integers:");
	        for (int i = 0; i < 10; i++) {
	            intArray[i] = input.nextInt();
	        }
	        double intArrayAverage = average(intArray);
	        System.out.printf("Average of integers: %.2f%n", intArrayAverage);

	        // Test with doubles
	        double[] doubleArray = new double[10];
	        System.out.println("Enter 10 double values:");
	        for (int i = 0; i < 10; i++) {
	            doubleArray[i] = input.nextDouble();
	        }
	        double doubleArrayAverage = average(doubleArray);
	        System.out.printf("Average of doubles: %.2f%n", doubleArrayAverage);

	        input.close();
	    }

	    public static double average(int[] array) {
	        int sum = 0;
	        for (int i=0; i<array.length; i++) {
	            sum += array[i];
	        }
	        double average= sum / array.length;
	        return average;
	    }

	    public static double average(double[] array) {
	        double sum = 0;
	        for (int i=0; i<array.length; i++) {
	            sum += array[i];
	        }
	        return sum / array.length;
	    }
	}


