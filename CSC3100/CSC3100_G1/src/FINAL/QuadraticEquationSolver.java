package FINAL;
import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double[] coefficients = new double [3];
        System.out.print("Enter the coefficients a, b, and c of the quadratic equation (ax^2 + bx + c = 0): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
//for (int i=0; i<coefficients.length;i++) {
	//coefficients[i]=scanner.nextDouble();
//}
       double[] coefficients = {a, b, c};
        double[] roots = new double[2];

        int numberOfRoots = solveQuadratic(coefficients, roots);

        System.out.println("Number of real roots: " + numberOfRoots);

        if (numberOfRoots > 0) {
            System.out.println("Root 1: " + roots[0]);
        }
        if (numberOfRoots > 1) {
            System.out.println("Root 2: " + roots[1]);
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            return 0;
        }
    }
}

