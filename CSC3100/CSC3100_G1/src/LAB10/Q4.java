/*Name:Choo En Yi
 * Lab:10
 * Date:3/1/2023
 * Question 4: Calculate retail price
 */
package LAB10;
import java.util.Scanner;

public class Q4 {
    static int pNo;
    static double ttlP = 0.0;
    static double grossSale = 0.0;
    static int ttlPackage = 0;
    static double donation = 0;
    static double netSale=0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a new scanner object
      

        while (true) {
            pNo = readInput("Enter package code (1 - 3, 0 to exit): ", input);
            if (pNo >= 1 && pNo <= 3) {
                int qty = readInput("Enter quantity: ", input);
                double price = calcPrice(pNo, qty);
                grossSale+=price;
                System.out.println("The total price: RM " + price);
                ttlPackage++;
            } else if (pNo==0){
            	break;
            }
            
            else {
            	System.out.println("INVALID");
            }
        }

        donation = calcDonation(grossSale);
        netSale = grossSale-donation;
        printInformation();
        input.close();
    }

    public static int readInput(String detail, Scanner input) {
        System.out.print(detail);
        return input.nextInt();
    }

    public static double calcPrice(int pNo, int qty) {
        double price;
        if (pNo == 1)
            price = 50 * qty;
        else if (pNo == 2)
            price = 100 * qty;
        else
            price = 200.0 * qty;
        
        return price;
    }


    public static double calcDonation(double grossSale) {
        double donation = 0;
        if (grossSale > 100000.0)
           donation =grossSale*0.15;
        else if (grossSale > 10000.0)
        	donation =grossSale*0.10;
        else if (grossSale > 1000.0)
        	donation =grossSale*0.05;
        return donation;
    }

   

    public static void printInformation() {
    	System.out.println("--------------------------INFORMATION PACKAGE--------------------------------------");
        System.out.println("Total Packages: " + ttlPackage);
        System.out.printf("Total Gross Sales of All Packages: RM %.2f\n" , grossSale);
        System.out.printf("Total Donation: RM %.2f\n" , donation);
        System.out.printf("Net Sales of Packages: RM%.2f\n ", netSale);
    }
}

