package LAB13;

import java.util.Scanner;

public class Q3 {
	static int total=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of states
        System.out.print("Enter the number of states: ");
        int numStates = scanner.nextInt();

        // Create a 2D array to store weekly cases for each state
        int[][] weeklyCases = new int[numStates][8]; // 8 columns (7 days + total)

        // a. Read daily cases for each state
        String[] states=readDailyCases(scanner, weeklyCases);

        // b. Find total cases for each state
        findTotalCases(weeklyCases);

        // c. Find overall total case for all states
        int overallTotal = findOverallTotal(weeklyCases);

        // d. Display the table
        displayTable(weeklyCases,total, overallTotal, states);

        // e. Display the line graph
        displayLineGraph(weeklyCases, overallTotal);

        scanner.close();
    }

    // a. Read daily cases for each state
    public static String[] readDailyCases(Scanner scanner, int[][] weeklyCases) {
    	String[] states = new String[weeklyCases.length];
        for (int i = 0; i < weeklyCases.length; i++) {
            System.out.print("Enter the name of State " + (i + 1) + ": ");
             states[i] = scanner.next();

            System.out.println("Enter daily cases for " + states[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                weeklyCases[i][j] = scanner.nextInt();
            }
        }return states;
    }

    // b. Find total cases for each state
    public static void findTotalCases(int[][] weeklyCases) {
        for (int i = 0; i < weeklyCases.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += weeklyCases[i][j];
            }
            weeklyCases[i][7] = total; // Store the total in the last column
        }
    }

    // c. Find overall total case for all states
    public static int findOverallTotal(int[][] weeklyCases) {
        int overallTotal = 0;
        for (int i = 0; i < weeklyCases.length; i++) {
            overallTotal += weeklyCases[i][7];
        }
        return overallTotal;
    }

    // d. Display the table
 // d. Display the table
    public static void displayTable(int[][] weeklyCases, int total, int overallTotal, String []states) {
        System.out.println("____________________________________Covid-19 Cases Summary_________________________________________________________________");
        System.out.printf("%-15s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s\n",
                "Disease\\Day", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun", "Total");

        for (int i = 0; i < weeklyCases.length; i++) {
            System.out.printf("%-15s", states[i] );
            for (int j = 0; j < 8; j++) {
                if (j < 7) {
                    // Use %d for integers
                    System.out.printf("%-12d", weeklyCases[i][j]);
                } else {
                    
                    System.out.print(weeklyCases[i][7]);
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-99s%d\n " ,"Overall Total Cases:", overallTotal);
    }

    // e. Display the line graph
    public static void displayLineGraph(int[][] weeklyCases, int overallTotal) {
        System.out.println("\nLine Graph - Percentage of Cases in Each State:");

        for (int i = 0; i < weeklyCases.length; i++) {
            System.out.print("State " + (i + 1) + ": ");
            
                int percentage = (int) ((weeklyCases[i][7] * 100.0) / overallTotal);
                printLineBasedOnPercentage(percentage);
            
            System.out.println();
        }
    }
 // Helper method to print a line based on the percentage value
    public static void printLineBasedOnPercentage(int percentage) {
        int lineLength = percentage / 2; // Adjust the scale as needed
        for (int k = 0; k < lineLength; k++) {
            System.out.print("*");
        }
        System.out.print(" " + percentage + "% ");
    }
}

