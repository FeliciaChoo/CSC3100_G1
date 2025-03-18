package Array;
import java.util.Scanner;

public class Qpg43 {
    static double largestNumber;

    public static void main(String[] args) {
        double[] num = read();
        largestNum(num);
        double occurrence = findOccurrence(num);
        display(occurrence);
    }

    public static double[] read() {
        Scanner input = new Scanner(System.in);
        double[] num = new double[6];
        for (int i = 0; i < 6; i++) {
            System.out.printf("Enter number %d:", i + 1);
            num[i] = input.nextDouble();
        }
        input.close();
        return num;
    }

    public static void largestNum(double[] num) {
         largestNumber = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largestNumber)
                largestNumber = num[i];
        }
    }

    public static double findOccurrence(double[] num) {
        double occurrence = 0.0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == largestNumber)
                occurrence++;
        }
        return occurrence;
    }

    public static void display(double occurrence) {
        System.out.printf("The largest number is %.2f and its occurrence count is %.0f\n", largestNumber, occurrence);
    }
}


