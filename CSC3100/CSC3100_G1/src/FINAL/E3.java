package FINAL;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int[] uniqueElements = new int[50];
        int[] occurrences = new int[50];
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;

        do {
            num = input.nextInt();
            if (num != 0) {
                array[count] = num;
                count++;
            }
        } while (num != 0);

        int uniqueCount = 0;

       for (int i = 0; i < count; i++) {
            int element = array[i];
            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueElements[j] == element) {
                    found = true;
                    occurrences[j]++;
                    break;
                }
            }

            if (!found) {
                uniqueElements[uniqueCount] = element;
                occurrences[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueElements[i] + " occurs " + occurrences[i] + " time(s)");
        }

        input.close();
    }
}


