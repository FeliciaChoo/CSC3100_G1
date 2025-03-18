package LAB13;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] memberId = { 10011, 10012, 20011, 20012, 10013, 10014, 20013 };
        int[] daysPlayed = readInput();
        double[] fee = calculateFee(daysPlayed);
        displayOutput(memberId, daysPlayed, fee);
    }

    public static int[] readInput() {
        int[] daysPlay = new int[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the number of day(s) for member " + (i + 1) + ": ");
            daysPlay[i] = input.nextInt();
        }
        input.close();
        return daysPlay;
    }

    public static double[] calculateFee(int[] daysPlayed) {
        double[] fee = new double[7];
        for (int i = 0; i < 7; i++) {
            if (daysPlayed[i] <= 5)
                fee[i] = 100 + 150;
            else if (daysPlayed[i] <= 10)
                fee[i] = 200 + 150;
            else if (daysPlayed[i] <= 15)
                fee[i] = 300 + 150;
            else if (daysPlayed[i] > 15)
                fee[i] = 500 + 150;
        }
        return fee;
    }

    public static void displayOutput(int[] memberId, int[] daysPlayed, double[] fee) {
        for (int i = 0; i < 7; i++) {
            System.out.printf("Member ID: %d has played for %-2d days. ", memberId[i], daysPlayed[i]);
            System.out.printf("The total fee is %.2f\n", fee[i]);
        }
    }
}

