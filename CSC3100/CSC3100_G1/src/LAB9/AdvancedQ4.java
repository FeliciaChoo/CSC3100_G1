package LAB9;
import java.util.Scanner;

public class AdvancedQ4 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int num = 1;
	        double ttlPrice;
	        char visit = 'Y';

	        System.out.println("************WELCOME TO ZOO NEGARA*************");

	        do {
	            System.out.println("------------------VISITOR " + num + "--------------------");

	            System.out.print("Enter your nationality (M|Malaysian / F|Foreigner): ");
	            char nation = input.next().charAt(0);

	            ttlPrice = processVisitor(input, nation);

	            System.out.print("\nThe total payment for VISITOR " + num + " is RM" + ttlPrice);
	            System.out.print("\nEnter another visitor (Y/N)?: ");
	            visit = input.next().charAt(0);
	            num++;
	        } while (visit == 'Y' || visit == 'y');
	    }

	    private static double processVisitor(Scanner input, char nation) {
	        double ttlPrice = 0.0;

	        do {
	            char category;

	            if (nation == 'M' || nation == 'm') {
	                category = processMalaysian(input);
	            } else if (nation == 'F' || nation == 'f') {
	                category = processForeigner(input);
	            } else {
	                System.out.println("Please enter a valid nationality.");
	                continue;
	            }

	            double price = calculatePrice(category);
	            System.out.print("Number of tickets: ");
	            int qty = input.nextInt();
	            double sum = price * qty;
	            ttlPrice += sum;

	            System.out.print("Total charge of Type " + Character.toUpperCase(category) + " ticket is RM" + sum);
	            System.out.print("\nBuy another ticket? (Y/N): ");
	        } while (input.next().charAt(0) == 'Y' || input.next().charAt(0) == 'y');

	        return ttlPrice;
	    }

	    private static char processMalaysian(Scanner input) {
	        char category;

	        do {
	            System.out.print("Enter your category (A|Adult/ C|Children/ S|Senior): ");
	            category = input.next().charAt(0);

	            if (!(category == 'A' || category == 'a' || category == 'C' || category == 'c' || category == 'S' || category == 's')) {
	                System.out.println("Please enter a valid category.");
	            }
	        } while (!(category == 'A' || category == 'a' || category == 'C' || category == 'c' || category == 'S' || category == 's'));

	        return category;
	    }

	    private static char processForeigner(Scanner input) {
	        char part;

	        do {
	            System.out.print("From which part? (I|Kad, Working Permit, Dependent Past / E|Asean / O|Others): ");
	            part = input.next().charAt(0);

	            if (!(part == 'I' || part == 'i' || part == 'E' || part == 'e' || part == 'O' || part == 'o')) {
	                System.out.println("Please enter a valid part.");
	            }
	        } while (!(part == 'I' || part == 'i' || part == 'E' || part == 'e' || part == 'O' || part == 'o'));

	        char foreignerCategory;

	        do {
	            System.out.print("Enter your category (A|Adult/ C|Children/ S|Senior): ");
	            foreignerCategory = input.next().charAt(0);

	            if (!(foreignerCategory == 'A' || foreignerCategory == 'a' || foreignerCategory == 'C' || foreignerCategory == 'c' || foreignerCategory == 'S' || foreignerCategory == 's')) {
	                System.out.println("Please enter a valid category.");
	            }
	        } while (!(foreignerCategory == 'A' || foreignerCategory == 'a' || foreignerCategory == 'C' || foreignerCategory == 'c' || foreignerCategory == 'S' || foreignerCategory == 's'));

	        return foreignerCategory;
	    }

	    private static double calculatePrice(char category) {
	        switch (Character.toUpperCase(category)) {
	            case 'A':
	                return 43.0;
	            case 'C':
	                return 16.0;
	            case 'S':
	                return 21.0;
	            default:
	                return 0.0;
	        }
	    }
	}

