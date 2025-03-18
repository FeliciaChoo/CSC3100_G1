package LAB4;
/*Name:Choo En Yi
 * Lab:4
 * Date:1/11/2023
 * Question 1: Display discount according to quantity and price
 */
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[]args) {
    Scanner input= new Scanner(System.in); //create a scanner object
    System.out.print("Enter total price item: RM");
    double price = input.nextDouble();
    input.nextLine();
    System.out.print("Enter total units of the item: ");
    int totalUnits = input.nextInt();
    input.nextLine();

     double dis=0;
    // If-else statement to calculate the discount
    if (price >= 0.01 && price <= 10) {
        if (totalUnits >= 1 && totalUnits <= 9) {
            System.out.println("Discount: 0%");
             dis=0;
        } else if (totalUnits >= 10 && totalUnits <= 99) {
            System.out.println("Discount: 5%");
            dis=5;
        } else if (totalUnits >= 100 && totalUnits <= 499) {
            System.out.println("Discount: 9%");
             dis=9;
        } else if (totalUnits >= 500 && totalUnits <= 999) {
            System.out.println("Discount: 14%");
            dis=14;
        } else {
            System.out.println("Discount: 21%");
             dis=21;
        }
    } else if (price >= 10.01 && price <= 100) {
        if (totalUnits >= 1 && totalUnits <= 9) {
            System.out.println("Discount: 2%");
             dis=2;
        } else if (totalUnits >= 10 && totalUnits <= 99) {
            System.out.println("Discount: 7%");
            dis=7;
        } else if (totalUnits >= 100 && totalUnits <= 499) {
            System.out.println("Discount: 15%");
            dis=15;
        } else if (totalUnits >= 500 && totalUnits <= 999) {
            System.out.println("Discount: 23%");
             dis=23;
        } else {
            System.out.println("Discount: 32%");
             dis=32;
        }
    } else if (price >= 100.01) {
        if (totalUnits >= 1 && totalUnits <= 9) {
            System.out.println("Discount: 5%");
             dis=5;
        } else if (totalUnits >= 10 && totalUnits <= 99) {
            System.out.println("Discount: 9%");
             dis=9;
        } else if (totalUnits >= 100 && totalUnits <= 499) {
            System.out.println("Discount: 21%");
            dis=21;
        } else if (totalUnits >= 500 && totalUnits <= 999) {
            System.out.println("Discount: 32%");
             dis=32;
        } else {
            System.out.println("Discount: 43%");
            dis=43;
        }
    }

    input.close();
    
   // Calculate discounted price
      double disPrice=price*(1-(dis/100));

    // Print output
    System.out.printf("The total price for %d items after discount is RM%.2f%n", totalUnits, disPrice);
}
}
    

