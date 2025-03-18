package FINAL;

public class E7 {

	    public static void main(String[] args) {
	        final int NUMBER_OF_RANDOMS = 200;
	        int[] counts = new int[10]; // Array to store counts for each digit

	        // Generate 200 random integers between 0 and 9
	        for (int i = 0; i < NUMBER_OF_RANDOMS; i++) {
	            int randomNumber = (int) (Math.random() * 10); // Convert double to int within the range [0, 9]
	            counts[randomNumber]++;
	        }

	        // Display the counts for each digit
	        System.out.println("Count of single digits:");

	        for (int i = 0; i < counts.length; i++) {
	            System.out.printf("%d: %d times%n", i, counts[i]);
	        }
	    }
	}

