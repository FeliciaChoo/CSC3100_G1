package Array;
import java.util.Scanner;
public class P1 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		//Initialize array
		String [] id= new String [3];
		boolean[]answer= {true, false, false, true,true};
		int []score= new int[3];
		char []grade= new char [3];
		int correct=0;
		int maxScore= score[0];
		
		for (int i=0; i< id.length; i++) {
			System.out.println("Enter student ID:");
			id[i]= input.nextLine();
			System.out.println("Enter the test answers(true/false):");
			for (int j=0; j< answer.length; j++) {
			System.out.println((j+1)+":");
			boolean ans=input.nextBoolean();
			input.nextLine();
			if (ans==answer[j])
				 correct++;
			}
			score[i]=correct;
			if (score[i]>maxScore) {
				maxScore=score[i];
			}
			if (correct>=maxScore-2)
				grade[i]='A';
			else if (correct>=maxScore-4)
				grade[i]='B';
			else if (correct>=maxScore-6)
				grade[i]='C';
			else if (correct>= maxScore-8)
				grade[i]='D';
			else if (correct< maxScore-8)
				grade[i]='F';
		}
		 System.out.println("Results:");
		 for (int i=0; i<id.length; i++) {
			 System.out.println("Student ID:"+ id[i]+ ", Number correct:"+ score[i]+",Grade:"+grade[i]);
			 
		 }
		System.out.println("The highest score in class:"+ maxScore);
			
			
			
				
			
		}
		
		
		
	}


