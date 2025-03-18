package FINAL;
public class SumIntegers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No integers provided. Please enter integers as command line arguments.");
            return;
        }

        int total = 0;

        // Loop through the command line arguments and sum the integers
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                total += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer: " + arg);
            }
        }

        // Display the total
        System.out.println("Total: " + total);
    }
}
