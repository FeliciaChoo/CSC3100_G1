/*Name:Choo En Yi
 * Lab:10
 * Date:3/1/2024
 * Question 2: Determine the grade egg
 */
package LAB10;
import java.util.Scanner;

public class Q2 {

    static int gA = 0, gB = 0, gC = 0, gD = 0;
    static double wA = 0, wB = 0, wC = 0, wD = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a new scanner object
        for (int num = 1; num <= 5; num++) {
            System.out.print("Enter the weight of egg " + num + ": ");
            double wgt = input.nextDouble();
           String grade = getGrade(wgt);
            countGrade(grade);
        }
        displayReport();
        input.close();
    }

    public static String getGrade(double wgt) {
        String g = "";

        if (wgt > 44) {
            g = "Grade A";
            wA += wgt;
        } else if (wgt >= 30 && wgt <= 44) {
            g = "Grade B";
            wB += wgt;
        } else if (wgt >= 25 && wgt < 30) {
            g = "Grade C";
            wC += wgt;
        } else if (wgt < 25) {
            g = "Grade D";
            wD += wgt;
        } else {
            System.out.println("Invalid weight");
        }
        System.out.println(g);
        return g;
    }

    public static void countGrade(String g) {
        if (g.equals("Grade A")) {
            gA++;
        } else if (g.equals("Grade B")) {
            gB++;
        } else if (g.equals("Grade C")) {
            gC++;
        } else if (g.equals("Grade D")) {
            gD++;
        }
    }

    public static void displayReport() {
    	System.out.println("\n*********************REPORT ABOUT EGGS*********************" );
        System.out.printf("Grade A - Total Eggs: %d , Average Weight: %.2f\n" ,gA,(wA / gA));
        System.out.printf("Grade B - Total Eggs: %d , Average Weight: %.2f\n" ,gB,(wB / gB));
        System.out.printf("Grade C - Total Eggs: %d , Average Weight: %.2f\n" ,gC,(wC / gC));
        System.out.printf("Grade D - Total Eggs: %d , Average Weight: %.2f\n" ,gD,(wD / gD));
        System.out.printf("Total weight for all the eggs: %.2f\n",(wA+wB+wC+wD));
        System.out.println("-----------------------------------------------------------");
    }
}


