/*Name:Choo En Yi
 * Lab:10
 * Date:3/1/2024
 * Question 1: Determine the grade egg
 */
package LAB10;
import java.util.Scanner;

public class Q1 {
    static double bmi = 0.0;
    static double bmr = 0.0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// create new scanner object
        char ctn = 'y';
        while (ctn == 'y' || ctn == 'Y') {
            int age = readInputInt("Enter age:", input);
            double weight = readInput("Enter weight(kg):", input);
            double height = readInput("Enter height(cm):", input);
            char gender = readInputG("Enter gender(f/m):", input);
            int choice = readInputInt("Enter choice(1-BMI, 2-BMR):", input);
            calcChoice(choice, weight, height, gender, age);
            String category = calcCategory();
            result(height, weight, bmi, category, bmr, choice);
            System.out.print("Do you want to continue?(y/n): ");
            ctn = input.next().charAt(0);
        }
        System.out.print("\n**************************************");
        input.close();
    }

    public static int readInputInt(String detail, Scanner input) {
        System.out.print(detail);
        return input.nextInt();
    }

    public static double readInput(String detail, Scanner input) {
        System.out.print(detail);
        return input.nextDouble();
    }

    public static char readInputG(String detail, Scanner input) {
        System.out.print(detail);
        return input.next().charAt(0);
    }

    public static void calcChoice(int choice, double weight, double height, char gender, int age) {
        if (choice == 1)
            bmi = weight / ((height / 100) * (height / 100));
        else if (choice == 2) {
            if (gender == 'f' || gender == 'F')
                bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
            else
                bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        }
    }

    public static String calcCategory() {
        String status = "";
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi >= 18.5 && bmi < 25)
            status = "Healthy weight";
        else if (bmi >= 25 && bmi < 30)
            status = "Overweight";
        else
            status = "Obesity";
        return status;
    }

    public static void result(double height, double weight, double bmi, String category, double bmr, int choice) {
    	System.out.printf("---------------------------------------------");
    	System.out.printf("\nYour height is %.2fcm and weight is %.2fkg.%n", height, weight);
        if (choice == 1) {
            System.out.printf("Your BMI is %.2f. You are %s.%n", bmi, category);
        } else if (choice == 2) {
            System.out.printf("Your BMR is %.2f.%n", bmr);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
