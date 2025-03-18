package Array;
import java.util.Scanner;
public class WithArray {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		double sum=0.0, avg=0.0;
		int abv=0;
		int[] num=new int[5];
		for (int i=0;i<5; i++) {
			System.out.printf("Enter %d integer:",i+1);
			num[i]=input.nextInt();
			sum+=num[i];
			}
		avg=sum/5;
		
		for (int i=0;i<5; i++) {
			if (avg<num[i])
				abv++;
		}System.out.printf("The average of five integers is %.2f and the numbers above the average is %d\n", avg,abv);
		input.close();
		}

}
