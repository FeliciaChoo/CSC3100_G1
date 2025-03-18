package FINAL;
import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // Compute and display the mean and standard deviation
        double meanValue = mean(numbers);
        double deviationValue = deviation(numbers);

        System.out.printf("Mean: %.2f%n", meanValue);
        System.out.printf("Standard Deviation: %.2f%n", deviationValue);

        input.close();
    }

    // Method to compute the deviation of double values
    public static double deviation(double[] x) {
        double meanValue = mean(x);
        double sumSquaredDeviations = 0;

        for (int i=0; i<x.length; i++) {
            sumSquaredDeviations += Math.pow(x[i] - meanValue, 2);
        }

        return Math.sqrt(sumSquaredDeviations / (x.length - 1));
    }

    // Method to compute the mean of an array of double values
    public static double mean(double[] x) {
        double sum = 0;
        for (int i=0; i< x.length;i++) {
            sum += x[i];
        }
        return sum / x.length;
    }
}
