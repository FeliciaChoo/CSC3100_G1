package FINAL;
import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter five numbers
        System.out.print("Enter five numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        // Find and display the gcd of the entered numbers
        int result = gcd(num1, num2, num3, num4, num5);
        System.out.println("The greatest common divisor (gcd) is: " + result);

        input.close();
    }

    // Method to compute the gcd of an unspecified number of integers
    public static int gcd(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided");
        }

        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = findGCD(result, numbers[i]);
        }

        return result;
    }

    // Method to find the gcd of two numbers
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

