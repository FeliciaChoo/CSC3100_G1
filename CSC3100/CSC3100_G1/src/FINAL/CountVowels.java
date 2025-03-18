package FINAL;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        int lowercaseVowelsCount = countVowels(userInput, "aeiou");
        int uppercaseVowelsCount = countVowels(userInput, "AEIOU");

        System.out.println("Number of lowercase vowels: " + lowercaseVowelsCount);
        System.out.println("Number of uppercase vowels: " + uppercaseVowelsCount);

        input.close();
    }

    public static int countVowels(String str, String vowels) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}

