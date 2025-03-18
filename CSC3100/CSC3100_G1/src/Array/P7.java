package Array;
public class P7 {
    public static void main(String[] args) {
        // Constants
        final int NUM_CLASS_LEVELS = 5; // 4 undergrad levels + 1 graduate level
        final int NUM_MAJORS = 7;
        final int TOTAL_STUDENTS = 1200;

        // Array to store the number of students in each class level
        int[] classLevels = new int[NUM_CLASS_LEVELS];

        // Array to store the number of students in each major
        int[] majors = new int[NUM_MAJORS];

        // 2D array to store the number of students for each class level and major combination
        int[][] classMajorCounts = new int[NUM_CLASS_LEVELS][NUM_MAJORS];

        // Populate sample data (you may replace this with actual data)
        // For simplicity, assuming equal distribution for this example
        for (int i = 0; i < NUM_CLASS_LEVELS; i++) {
            classLevels[i] = TOTAL_STUDENTS / NUM_CLASS_LEVELS;
            for (int j = 0; j < NUM_MAJORS; j++) {
                majors[j] = TOTAL_STUDENTS / NUM_MAJORS;
                classMajorCounts[i][j] = TOTAL_STUDENTS / (NUM_CLASS_LEVELS * NUM_MAJORS);
            }
        }

        // Output the information
        System.out.println("Number of students in each class level:");
        for (int i = 0; i < NUM_CLASS_LEVELS; i++) {
            System.out.println("Class Level " + i + ": " + classLevels[i] + " students");
        }

        System.out.println("\nNumber of students in each major:");
        for (int j = 0; j < NUM_MAJORS; j++) {
            System.out.println("Major " + j + ": " + majors[j] + " students");
        }

        System.out.println("\nNumber of students for each class level and major combination:");
        for (int i = 0; i < NUM_CLASS_LEVELS; i++) {
            for (int j = 0; j < NUM_MAJORS; j++) {
                System.out.println("Class Level " + i + ", Major " + j + ": " + classMajorCounts[i][j] + " students");
            }
        }
    }
}



