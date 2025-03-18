package FINAL;
public class UppercaseCount {
    public static void main(String[] args) {
    	String []k= {"Hello World"};
        if (k.length == 0) {
            System.out.println("No string provided. Please enter a string as a command line argument.");
            return;
        }

        String inputString = k[0];
        char [] uppercaseCount = countUppercaseLetters(inputString);
        System.out.println("uppercase letters: " );
        for (int i = 0; i < uppercaseCount.length; i++) {
        	System.out.print( uppercaseCount[i]+"");
        }
    }

    // Method to count the number of uppercase letters in a string
    private static char []countUppercaseLetters(String str) {
        int count = 0;
        char []array=new char [str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
            	array[count]=ch;
                count++;
            }
        }

        return array;
    }
}
