package FINAL;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the string
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Call the sort method
        String sortedString = sort(inputString);

        // Display the sorted string
        System.out.println("Sorted string: " + sortedString);

        input.close();
    }

    // Method to sort characters in a string using Bubble Sort
    public static String sort(String s) {
        //char[] charArray = s.toCharArray();
    	char[] charArray = new char [s.length()];
    	for (int i=0;i<charArray.length; i++) {
    		charArray[i]=s.charAt(i);
    	}
        
        // Bubble Sort
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap the characters
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        return new String(charArray);
    }
}
