package FINAL;

public class E6 {
	    public static void main(String[] args) {
	        final int NUMBER_OF_PRIMES = 50;
	        final int NUMBER_OF_PRIMES_PER_LINE = 10;

	        int[] primes = new int[NUMBER_OF_PRIMES];
	        int count = 0;
	        int number = 2;

	        System.out.println("The first 50 prime numbers are:");

	        while (count < NUMBER_OF_PRIMES) {
	            if (isPrime(number, primes)) {
	                primes[count] = number;
	                count++;

	                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
	                    System.out.println(number);
	                } else {
	                    System.out.print(number + " ");
	                }
	            }

	            number++;
	        }
	    }

	    public static boolean isPrime(int num, int[] primes) {
	        for (int i = 0; i < primes.length && primes[i] != 0 && primes[i] <= Math.sqrt(num); i++) {
	            if (num % primes[i] == 0) {
	                return false; // num is not prime
	            }
	        }
	        return true; // num is prime
	    }
	}

