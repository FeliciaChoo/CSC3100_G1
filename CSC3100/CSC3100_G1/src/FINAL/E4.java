package FINAL;
import java.util.Scanner;
public class E4 {
	public static void main(String[]args) {
		        Scanner input = new Scanner(System.in);

		        System.out.println("Enter scores (enter -1 to end input):");

		        // Initialize an array to store scores (maximum 100 scores)
		        double[] scores = new double[100];
		        int scoreCount = 0;
		        double score=0.0;

		        // Read scores and store in the array
		        do {
		            score = input.nextDouble();

		            scores[scoreCount] = score;
		            scoreCount++;
		        }while (score!=-1);

		        // Avoid division by zero
		        if (scoreCount == 0) {
		            System.out.println("No scores entered.");
		        } else {
		            // Calculate average
		            double totalScore = 0;
		            for (int i = 0; i < scoreCount; i++) {
		                totalScore += scores[i];
		            }

		            double average = totalScore / scoreCount;
		            System.out.printf("Average score: %.2f%n", average);

		            // Count scores above and below average
		            int aboveAverageCount = 0;
		            int belowAverageCount = 0;

		            System.out.println("Analysis Results:");

		            for (int i = 0; i < scoreCount-1; i++) {
		                if (scores[i] >= average) {
		                    aboveAverageCount++;
		                } else {
		                    belowAverageCount++;
		                }
		            }

		            // Display results
		            System.out.printf("Scores above or equal to average: %d%n", aboveAverageCount);
		            System.out.printf("Scores below average: %d%n", belowAverageCount);
		        }

		        input.close();
		    }
		}
