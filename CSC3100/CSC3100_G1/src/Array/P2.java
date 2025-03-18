package Array;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize arrays
        int[] customersPerHour = new int[24];
        int[] employeesNeededPerHour = new int[24];

        // Input the number of customers per hour for 14 days
        for (int day = 1; day <= 14; day++) {
            System.out.println("Enter the number of customers for each hour on Day " + day + ":");
            for (int hour = 0; hour < 24; hour++) {
                System.out.print("Hour " + (hour + 1) + ": ");
                customersPerHour[hour] += input.nextInt();
            }
        }

        // Calculate the average number of customers per hour
        for (int hour = 0; hour < 24; hour++) {
            int averageCustomers = customersPerHour[hour] / 14;
            
            // Calculate the number of employees needed
            employeesNeededPerHour[hour] = Math.max(3, 3 + (averageCustomers / 20));
        }

        // Output the needed number of employees per hour
        System.out.println("\nEmployees Needed per Hour:");
        for (int hour = 0; hour < 24; hour++) {
            System.out.println("Hour " + (hour + 1) + ": " + employeesNeededPerHour[hour]);
            input.close();
       
        }
    }
}
