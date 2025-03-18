package PracticeT6;
import java.util.*;
import java.io.*;


public class WriteData {
    public static void main(String[] args) throws Exception {
        java.io.File file= new java.io.File("scores.txt");
        java.io.File file2= new java.io.File("GradeScr.txt");
  

        if (file.exists()) {
            System.out.println("File  already exists");
            System.exit(0);
        }

        // Create a file
        java.io.PrintWriter output= new java.io.PrintWriter(file);

        // Write formatted output to the file
        
        output.println("111111  15     17     12      38");
        output.println("111112  15     15     15      20");
        output.println("111113  10     18     12      15");
        output.println("111114  12     12     16      11");

        // Close the PrintWriter
        output.close();
        //Read data from a file
        
        Scanner input=new Scanner(file);
        double total=0.0;
        String grade=null;
        java.io.PrintWriter output2= new java.io.PrintWriter(file2);
        while(input.hasNext()) {
        	String matric= input.next();
        	double test1= input.nextDouble();
        	double test2= input.nextDouble();
        	double lab=input.nextDouble();
        	double finalExam=input.nextDouble();
        	System.out.printf("%15s %5s %5s %5s %5s", matric, test1, test2, lab, finalExam)
  ;
        	System.out.println();
        	 total =test1+test2+lab+finalExam;
        	
               if (total>=75 && total<=100)
        			     grade="A";
        		else if (total>=60 && total<=74)
        			grade="B";
        		else if (total>=45 && total<=59)
        			 grade="C";
        		else if (total>=40 && total<=44)
        			 grade="D";
        		else
        			 grade="F";
               System.out.printf("Matric %s Total %.2f and grade %s", matric, total, grade);
               System.out.println();
               output2.printf(" %s\t  %.2f \t %s%n", matric, total, grade);
               
        
        } input.close();
        output2.close();
    }
        
}




    


