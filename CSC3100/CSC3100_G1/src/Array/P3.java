package Array;
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int NUM_SALESPEOPLE = 2;
        int NUM_DAYS = 7;
        int DAYS_OFF_PER_SALESPERSON = 2;

        // Initialize arrays
        double[][] salesData = new double[NUM_SALESPEOPLE][NUM_DAYS];
        double[] totalSalesPerDay = new double[NUM_DAYS];
        double[] totalSalesPerSalesperson = new double[NUM_SALESPEOPLE];
        double grandTotalSales = 0;

        // Input sales data
        for (int salesperson = 0; salesperson < NUM_SALESPEOPLE; salesperson++) {
            System.out.println("Enter sales data for Salesperson " + (salesperson + 1) + ":");
            for (int day = 0; day < NUM_DAYS; day++) {
                System.out.print("Day " + (day + 1) + ": $");
                salesData[salesperson][day] = scanner.nextDouble();
            }
        }

        // Calculate total sales per day and per salesperson
        for (int day = 0; day < NUM_DAYS; day++) {
            for (int salesperson = 0; salesperson < NUM_SALESPEOPLE; salesperson++) {
                totalSalesPerDay[day] += salesData[salesperson][day];
                totalSalesPerSalesperson[salesperson] += salesData[salesperson][day];
            }
            grandTotalSales += totalSalesPerDay[day];
        }

        // Output the needed information
        System.out.println("\nSales Information:");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n",
                "Salesperson", "Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7",
                "Total Sales", "Average Sales");
        System.out.println("-----------------------------------------------------------------");

        for (int salesperson = 0; salesperson < NUM_SALESPEOPLE; salesperson++) {
            System.out.printf("%-20s", "Salesperson " + (salesperson + 1));

            for (int day = 0; day < NUM_DAYS; day++) {
                System.out.printf("$%-14.2f", salesData[salesperson][day]);
            }

            System.out.printf("$%-14.2f$%-14.2f%n",
                    totalSalesPerSalesperson[salesperson],
                    totalSalesPerSalesperson[salesperson] / (NUM_DAYS - DAYS_OFF_PER_SALESPERSON));
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s", "Total Sales per Day");

        for (int day = 0; day < NUM_DAYS; day++) {
            System.out.printf("$%-14.2f", totalSalesPerDay[day]);
        }

        System.out.println("\n-----------------------------------------------------------------");
        System.out.printf("%-20s$%-14.2f%n", "Grand Total Sales", grandTotalSales);
        System.out.println("-----------------------------------------------------------------");
    scanner.close();
    }
}
